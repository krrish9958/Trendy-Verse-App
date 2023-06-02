package com.project.trendyverse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.trendyverse.adapter.TrendCardAdapter
import com.project.trendyverse.models.trendcarddata


class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter : TrendCardAdapter
    private lateinit var cardList : ArrayList<trendcarddata>
    private lateinit var cardImg : Array<Int>

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


}