package com.example.android.politicalpreparedness.election.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.politicalpreparedness.databinding.ViewholderElectionBinding
import com.example.android.politicalpreparedness.election.models.ElectionModel
import com.example.android.politicalpreparedness.network.models.Election

class ElectionListAdapter(private val clickListener: ElectionListener) :
    ListAdapter<ElectionModel, ElectionListAdapter.ElectionViewHolder>(ElectionDiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElectionViewHolder {
        return ElectionViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ElectionViewHolder, position: Int) {
        val electionModel = getItem(position)
        holder.bindDataToView(electionModel, clickListener)
    }

    class ElectionViewHolder(val binding: ViewholderElectionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent: ViewGroup) = ElectionViewHolder(
                ViewholderElectionBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }

        fun bindDataToView(electionModel: ElectionModel, listener: ElectionListener) {
            binding.election = electionModel
            binding.listener = listener
            binding.executePendingBindings()
        }
    }
}

class ElectionDiffCallback : DiffUtil.ItemCallback<ElectionModel>() {
    override fun areItemsTheSame(oldItem: ElectionModel, newItem: ElectionModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ElectionModel, newItem: ElectionModel): Boolean {
        return oldItem == newItem
    }
}

class ElectionListener(val clickListener: (electionModel: ElectionModel) -> Unit) {
    fun onClickListener(electionModel: ElectionModel) = clickListener(electionModel)
}