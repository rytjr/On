package com.example.lunchchoice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.FragmentAaaaaaaaaaaaBinding


class Aaaaaaaaaaaa : Fragment(), MainDisplay.onBackPressedListener {

    lateinit var binding: FragmentAaaaaaaaaaaaBinding

    override fun onBackPresseda() {
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAaaaaaaaaaaaBinding.inflate(inflater, container, false)


        val profilelist = arrayListOf(

            ItemList(R.drawable.ssalgok, "쌀국수"),
            ItemList(R.drawable.euk, "우육면"),
            ItemList(R.drawable.gren, "그린커리"),
            ItemList(R.drawable.pett, "팟타이"),
            ItemList(R.drawable.cur, "커리"),
            ItemList(R.drawable.ffffffffffffffffffffffffff, "마살라도사"),
            ItemList(R.drawable.samo, "사모사"),
            ItemList(R.drawable.rott, "로띠"),
            ItemList(R.drawable.baku, "바쿠테"),
            ItemList(R.drawable.nase, "나시고랭"),
            ItemList(R.drawable.keb, "케밥"),
            ItemList(R.drawable.ddomna, "똠냥꿍")

        )



        binding.recyclerHorizon14.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon14.setHasFixedSize(true)
        binding.recyclerHorizon14.adapter = Exem(profilelist)





        return binding.root

    }


}