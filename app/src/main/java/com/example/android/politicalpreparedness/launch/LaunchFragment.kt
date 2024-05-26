package com.example.android.politicalpreparedness.launch

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.basecontent.BaseFragment
import com.example.android.politicalpreparedness.databinding.FragmentLaunchBinding

class LaunchFragment : BaseFragment<FragmentLaunchBinding>() {
    override fun layoutViewDataBinding(): Int = R.layout.fragment_launch

    override fun initData(data: Bundle?) {
        mFragmentBinding.lifecycleOwner = this
    }

    override fun initViews() {

    }

    override fun initActions() {
        mFragmentBinding.representativeButton.setOnClickListener {
            navToRepresentatives()
        }
        mFragmentBinding.upcomingButton.setOnClickListener {
            navToElections()
        }
    }

    override fun initObservers() {

    }

    private fun navToElections() {
        this.findNavController()
            .navigate(LaunchFragmentDirections.actionLaunchFragmentToElectionsFragment())
    }

    private fun navToRepresentatives() {
        this.findNavController()
            .navigate(LaunchFragmentDirections.actionLaunchFragmentToRepresentativeFragment())
    }

}
