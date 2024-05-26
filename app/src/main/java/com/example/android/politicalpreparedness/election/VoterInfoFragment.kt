package com.example.android.politicalpreparedness.election

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.basecontent.BaseFragment
import com.example.android.politicalpreparedness.databinding.FragmentVoterInfoBinding

class VoterInfoFragment : BaseFragment<FragmentVoterInfoBinding>() {

    private val mViewModel: VoterInfoViewModel by viewModels()

    //private val args by navArgs()
    private val navArgs: VoterInfoFragmentArgs by navArgs()

    override fun layoutViewDataBinding(): Int = R.layout.fragment_voter_info


    // TODO: Add ViewModel values and create ViewModel

    // TODO: Add binding values

    // TODO: Populate voter info -- hide views without provided data.

    /**
    Hint: You will need to ensure proper data is provided from previous fragment.
     */

    // TODO: Handle loading of URLs

    // TODO: Handle save button UI state
    // TODO: cont'd Handle save button clicks


    override fun initData(data: Bundle?) {
        mFragmentBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = mViewModel
        }
    }

    override fun initViews() {
        val election = navArgs.electionArg
        mViewModel.getElection(election.id)
        if (election.division.state.isEmpty()) {
            mViewModel.getVoterInfo(navArgs.electionArg.id, navArgs.electionArg.division.country)
        } else {
            mViewModel.getVoterInfo(
                navArgs.electionArg.id,
                "${navArgs.electionArg.division.country} - ${navArgs.electionArg.division.state}"
            )
        }

        mViewModel.Url.observe(viewLifecycleOwner, Observer {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it))
            startActivity(intent)
        })
    }

    override fun initActions() {

    }

    override fun initObservers() {

    }

    // TODO: Create method to load URL intents
}