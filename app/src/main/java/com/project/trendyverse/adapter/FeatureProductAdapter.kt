package com.project.trendyverse.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.trendyverse.R
import com.project.trendyverse.models.featureproductdata

class FeatureProductAdapter(private val productList : ArrayList<featureproductdata>):RecyclerView.Adapter<FeatureProductAdapter.FeatureProductViewHolder>() {
    class FeatureProductViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        val productCard : ImageView = itemView.findViewById(R.id.productImg1)
        val productCard2 : ImageView = itemView.findViewById(R.id.productImg2)
        val brandname : TextView = itemView.findViewById(R.id.brandName)
        val brandname2 : TextView = itemView.findViewById(R.id.brandName2)
        val productname :TextView = itemView.findViewById(R.id.productName)
        val productname2 :TextView = itemView.findViewById(R.id.productName2)
        val price1 : TextView= itemView.findViewById(R.id.productPrice)
        val price2 : TextView= itemView.findViewById(R.id.productPrice2)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FeatureProductViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.list_item_featureproduct,parent,false)
        return FeatureProductViewHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: FeatureProductViewHolder,
        position: Int
    ) {
        val currentCard = productList[position]
        holder.productCard.setImageResource(currentCard.productImg)
        holder.productCard2.setImageResource(currentCard.productImgtwo)
        holder.brandname.text=currentCard.productBrand
        holder.brandname2.text=currentCard.productBrandtwo
        holder.productname.text=currentCard.productName
        holder.productname2.text=currentCard.productNametwo
        holder.price1.text=currentCard.productPrice
        holder.price2.text=currentCard.productPricetwo
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}