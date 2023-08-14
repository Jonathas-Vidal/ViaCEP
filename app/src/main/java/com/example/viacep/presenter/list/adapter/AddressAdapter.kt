package com.example.viacep.presenter.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.viacep.databinding.ItemAddressBinding
import com.example.viacep.domain.model.Adress

class AddressAdapter : ListAdapter<Adress, AddressAdapter.ViewHolder>(DIFF_CALLBACK) {

    companion object {
        object DIFF_CALLBACK : DiffUtil.ItemCallback<Adress>() {
            override fun areItemsTheSame(
                oldItem: Adress,
                newItem: Adress
            ): Boolean {
                return oldItem.cep == newItem.cep
            }

            override fun areContentsTheSame(
                oldItem: Adress,
                newItem: Adress
            ): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemAddressBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val adress = getItem(position)

        holder.binding.textAddress.text = adress.getFullAdress()
        holder.binding.viewFlipper.displayedChild = 1
    }

    inner class ViewHolder(val binding: ItemAddressBinding) : RecyclerView.ViewHolder(binding.root)
}