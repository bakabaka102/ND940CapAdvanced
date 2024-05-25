package com.example.android.politicalpreparedness.representative

import android.content.Context
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.view.*
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.basecontent.BaseFragment
import com.example.android.politicalpreparedness.databinding.FragmentRepresentativeBinding
import com.example.android.politicalpreparedness.network.models.Address
import com.example.android.politicalpreparedness.utils.isAccessFineLocation
import java.util.Locale

class RepresentativeFragment : BaseFragment<FragmentRepresentativeBinding>() {

    private lateinit var mContext: Context

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

    }

    override fun initViews() {

    }

    override fun initActions() {

    }

    override fun initObservers() {

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
        val imm = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken, 0)
    }

}