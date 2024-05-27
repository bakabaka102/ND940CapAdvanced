package com.example.android.politicalpreparedness.election

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.basecontent.BaseFragment
import com.example.android.politicalpreparedness.databinding.FragmentVoterInfoBinding
import com.example.android.politicalpreparedness.network.models.Election

class VoterInfoFragment : BaseFragment<FragmentVoterInfoBinding>() {

    private val mViewModel: VoterInfoViewModel by viewModels()

    //private val args by navArgs()
    private val navArgs: VoterInfoFragmentArgs by navArgs()

    override fun layoutViewDataBinding(): Int = R.layout.fragment_voter_info

    override fun initData(data: Bundle?) {
        mFragmentBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = mViewModel
        }
    }

    override fun initViews() {
        val election: Election = navArgs.electionArg
        mViewModel.getElection(election.id)
        val address = if (election.division.state.isEmpty()) {
            navArgs.electionArg.division.country
        } else {
            "${navArgs.electionArg.division.country} - ${navArgs.electionArg.division.state}"
        }
        mViewModel.getVoterInfo(address, navArgs.electionArg.id)
    }

    override fun initActions() {

    }

    override fun initObservers() {
        mViewModel.isLoading.observe(viewLifecycleOwner) {
            if (it) {
                mFragmentBinding.loadingViewInfo.visibility = View.VISIBLE
            } else {
                mFragmentBinding.loadingViewInfo.visibility = View.GONE
            }
        }
    }

}