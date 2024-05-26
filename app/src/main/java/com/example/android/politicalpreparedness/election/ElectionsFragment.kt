package com.example.android.politicalpreparedness.election

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.basecontent.BaseFragment
import com.example.android.politicalpreparedness.databinding.FragmentElectionBinding
import com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter
import com.example.android.politicalpreparedness.election.adapter.ElectionListener
import com.example.android.politicalpreparedness.network.models.Election

class ElectionsFragment : BaseFragment<FragmentElectionBinding>() {

    private val mViewModel: ElectionsViewModel by viewModels()
    private lateinit var upcomingElectionAdapter: ElectionListAdapter
    private lateinit var savedElectionAdapter: ElectionListAdapter

    override fun layoutViewDataBinding(): Int = R.layout.fragment_election

    override fun initData(data: Bundle?) {

    }

    override fun initViews() {
        initUpcomingAdapter()
        initSavedAdapter()
    }

    override fun initActions() {

    }

    override fun initObservers() {
        mViewModel.upcomingElections.observe(viewLifecycleOwner) { elections ->
            elections?.apply {
                upcomingElectionAdapter.submitList(elections)
            }
        }

        mViewModel.savedElections.observe(viewLifecycleOwner) { elections ->
            elections?.apply {
                savedElectionAdapter.submitList(elections)
            }
        }
    }

    private fun initSavedAdapter() {
        savedElectionAdapter = ElectionListAdapter(
            ElectionListener {
                navigateToVoterFragment(it)
            })
        mFragmentBinding.savedElectionsRecyclerView.adapter = savedElectionAdapter
    }

    private fun initUpcomingAdapter() {
        upcomingElectionAdapter = ElectionListAdapter(
            ElectionListener {
                navigateToVoterFragment(it)
            }
        )
        mFragmentBinding.upcomingElectionsRecyclerView.adapter = upcomingElectionAdapter
    }

    private fun navigateToVoterFragment(it: Election) {
        findNavController().navigate(
            ElectionsFragmentDirections.actionElectionsFragmentToVoterInfoFragment(it)
        )
    }
}