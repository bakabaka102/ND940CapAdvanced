package com.example.android.politicalpreparedness.election

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.basecontent.BaseFragment
import com.example.android.politicalpreparedness.databinding.FragmentElectionBinding
import com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter
import com.example.android.politicalpreparedness.election.adapter.ElectionListener

class ElectionsFragment : BaseFragment<FragmentElectionBinding>() {

    private val mViewModel: ElectionsViewModel by viewModels()
    private lateinit var upcomingElectionAdapter: ElectionListAdapter
    private lateinit var savedElectionAdapter: ElectionListAdapter

    override fun layoutViewDataBinding(): Int = R.layout.fragment_election

    override fun initData(data: Bundle?) {

    }

    override fun initViews() {
        //DONE: Populate recycler adapters

        upcomingElectionAdapter = ElectionListAdapter(ElectionListener {
            /*findNavController().navigate(
                ElectionsFragmentDirections.actionElectionsFragmentToVoterInfoFragment(it)
            )*/
        }
        )

        mFragmentBinding.upcomingElectionsRecyclerView.adapter = upcomingElectionAdapter

        savedElectionAdapter = ElectionListAdapter(ElectionListener {
           /* findNavController().navigate(
                ElectionsFragmentDirections.actionElectionsFragmentToVoterInfoFragment(it)
            )*/
        })

        mFragmentBinding.savedElectionsRecyclerView.adapter = savedElectionAdapter


        mViewModel.upcomingElections.observe(viewLifecycleOwner) { elections ->
            elections?.apply {
                upcomingElectionAdapter.submitList(elections)
            }
        }

        mViewModel.savedElections.observe(viewLifecycleOwner) { elections ->
            elections?.apply {
                //savedElectionAdapter.elections = elections
                savedElectionAdapter.submitList(elections)
            }
        }
    }

    override fun initActions() {

    }

    override fun initObservers() {

    }

    // TODO: Refresh adapters when fragment loads
}