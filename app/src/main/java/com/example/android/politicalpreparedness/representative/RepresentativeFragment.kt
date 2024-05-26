package com.example.android.politicalpreparedness.representative

import android.content.Context
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import androidx.core.content.getSystemService
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.basecontent.BaseFragment
import com.example.android.politicalpreparedness.databinding.FragmentRepresentativeBinding
import com.example.android.politicalpreparedness.network.models.Address
import com.example.android.politicalpreparedness.representative.adapter.RepresentativeListAdapter
import com.example.android.politicalpreparedness.representative.adapter.RepresentativeListener
import com.example.android.politicalpreparedness.utils.LogUtils
import com.example.android.politicalpreparedness.utils.ToastUtils
import com.example.android.politicalpreparedness.utils.isAccessFineLocation
import com.google.android.material.snackbar.Snackbar
import java.util.Locale

class RepresentativeFragment : BaseFragment<FragmentRepresentativeBinding>() {

    private val mViewModel: RepresentativeViewModel by viewModels()
    private lateinit var mContext: Context
    private lateinit var representativeAdapter: RepresentativeListAdapter

    companion object {
        //TODO: Add Constant for Location request
    }

    //TODO: Declare ViewModel
    //TODO: Establish bindings
    //TODO: Define and assign Representative adapter
    //TODO: Populate Representative adapter
    //TODO: Establish button listeners for field and location search


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun initData(data: Bundle?) {
        mFragmentBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = mViewModel
            executePendingBindings()
        }
    }

    override fun initViews() {
        loadStates()
        /*mFragmentBinding.address =
            Address("Amphitheatre Parkway", "1600", "Mountain View", "California", "94043")*/
        representativeAdapter = RepresentativeListAdapter(RepresentativeListener {

        })
        mFragmentBinding.representativesRecyclerView.adapter =
            RepresentativeListAdapter(RepresentativeListener {})
        val linearLayoutManager = GridLayoutManager(requireActivity(), 1)
        mFragmentBinding.representativesRecyclerView.layoutManager = linearLayoutManager
        //mFragmentBinding.representativesRecyclerView.adapter = representativeAdapter
    }

    private fun loadStates() {
        /*val states = resources.getStringArray(R.array.states)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, states)
        mFragmentBinding.state.adapter = adapter*/
        mFragmentBinding.state.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    mViewModel.fillState(requireContext().resources.getStringArray(R.array.states)[position])
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
    }

    override fun initActions() {
        mFragmentBinding.buttonLocation.setOnClickListener {
            mViewModel.addressData.value.also {
                LogUtils.d("Address buttonLocation click: ==== $it")
            }
            ToastUtils.showToast(requireActivity(), "ButtonLocation clicked")
            checkLocationPermissions()
        }
    }

    override fun initObservers() {
        mViewModel.representatives.observe(viewLifecycleOwner) { representatives ->
            representativeAdapter.submitList(representatives)
        }
        mViewModel.errorMessage.observe(viewLifecycleOwner) {
            Snackbar.make(mFragmentBinding.root, it, Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun layoutViewDataBinding(): Int = R.layout.fragment_representative

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        //TODO: Handle location permission result to get location on permission granted
    }

    private fun checkLocationPermissions(): Boolean {
        return if (mContext.isAccessFineLocation()) {
            true
        } else {
            //TODO: Request Location permissions
            false
        }
    }

    private fun getLocation() {
        //TODO: Get location from LocationServices
        //TODO: The geoCodeLocation method is a helper function to change the lat/long location to a human readable street address
    }

    private fun geoCodeLocation(location: Location): Address? {
        val geocoder = context?.let { Geocoder(it, Locale.getDefault()) }
        return geocoder?.getFromLocation(location.latitude, location.longitude, 1)?.map { address ->
            Address(
                address.thoroughfare,
                address.subThoroughfare,
                address.locality,
                address.adminArea,
                address.postalCode
            )
        }?.first()
    }

    private fun hideKeyboard() {
        //val imm = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        val imm = activity?.getSystemService<InputMethodManager>()
        imm?.hideSoftInputFromWindow(view?.windowToken, 0)
    }

}