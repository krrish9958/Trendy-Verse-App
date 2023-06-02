package com.project.trendyverse.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.project.trendyverse.R
import com.project.trendyverse.models.trendcarddata

class TrendCardAdapter (private val cardList : ArrayList<trendcarddata>):RecyclerView.Adapter<TrendCardAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.listitem_cardtrend,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentCard = cardList[position]
        holder.trendCard.setImageResource(currentCard.cardImg)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    class MyViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        val trendCard : ImageView = itemView.findViewById(R.id.cardImg)
    }

}