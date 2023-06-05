package com.project.trendyverse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.trendyverse.adapter.FeatureProductAdapter
import com.project.trendyverse.adapter.TrendCardAdapter
import com.project.trendyverse.models.featureproductdata
import com.project.trendyverse.models.trendcarddata


class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter : TrendCardAdapter
    private lateinit var cardList : ArrayList<trendcarddata>
    private lateinit var cardImg : Array<Int>



    //feature product recyclerView
    private lateinit var recyclerViewtwo: RecyclerView
    private lateinit var adaptertwo : FeatureProductAdapter
    private lateinit var productList : ArrayList<featureproductdata>
    private lateinit var productcardImg1 : Array<Int>
    private lateinit var productcardImg2 : Array<Int>
    private lateinit var brandName : Array<String>
    private lateinit var brandName2 : Array<String>
    private lateinit var productName : Array<String>
    private lateinit var productName2 : Array<String>
    private lateinit var price : Array<String>
    private lateinit var price2 : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


            }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView=view.findViewById(R.id.trendCardRecyclerCiew)
        cardList = arrayListOf<trendcarddata>()
        adapter= TrendCardAdapter(cardList)
        cardImg= arrayOf(
            R.drawable.nikeairjordanss,
            R.drawable.sliderwinter,
            R.drawable.sliderwatch,
            R.drawable.sliderwomens


        )
        recyclerView.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false)
        recyclerView.setHasFixedSize(true)
        getCardData()




        //feature product RecyclerView code
        recyclerViewtwo=view.findViewById(R.id.featureProductRecyclerView)
        productList = arrayListOf<featureproductdata>()
        adaptertwo= FeatureProductAdapter(productList)
        productcardImg1= arrayOf(
            R.drawable.nikeairjordanss,
            R.drawable.sliderwinter,
            R.drawable.sliderwatch,
            R.drawable.sliderwomens
        )
        productcardImg2= arrayOf(
            R.drawable.nikeairjordanss,
            R.drawable.sliderwinter,
            R.drawable.sliderwatch,
            R.drawable.sliderwomens
        )
        brandName = arrayOf(
            "bchjeb",
            "cbhcbbhc",
            "sjcbhjcj",
            "ncncncncn"
        )
        brandName2 = arrayOf(
            "bchjeb",
            "cbhcbbhc",
            "sjcbhjcj",
            "ncncncncn"
        )
        productName = arrayOf(
            "bchjeb",
            "cbhcbbhc",
            "sjcbhjcj",
            "ncncncncn"
        )
        productName2 = arrayOf(
            "bchjeb",
            "cbhcbbhc",
            "sjcbhjcj",
            "ncncncncn"
        )
        price = arrayOf(
            "bchjeb",
            "cbhcbbhc",
            "sjcbhjcj",
            "ncncncncn"
        )
        price2= arrayOf( "bchjeb",
            "cbhcbbhc",
            "sjcbhjcj",
            "ncncncncn")
        recyclerView.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false)
        recyclerView.setHasFixedSize(true)
        getProductData()

        // Inflate the layout for this fragment
        return view
    }
    private fun getCardData(){
        for (i in cardImg.indices){
            val card = trendcarddata(cardImg[i])
            cardList.add((card))
        }
        recyclerView.adapter=adapter
    }

    private fun getProductData() {
        for (i in productcardImg1.indices){
            val product = featureproductdata(productcardImg1[i],productcardImg2[i], brandName[i],brandName2[i],productName[i],productName2[i],price[i],price2[i])
            productList.add(product)
        }
        recyclerViewtwo.adapter=adaptertwo
    }


}