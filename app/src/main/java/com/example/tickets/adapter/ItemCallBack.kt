package com.example.tickets.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.tickets.model.entity.Offer

object ItemCallBack: DiffUtil.ItemCallback<Offer>(){
    override fun areItemsTheSame(oldItem: Offer, newItem: Offer): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Offer, newItem: Offer): Boolean {
        return oldItem == newItem

    }
}
