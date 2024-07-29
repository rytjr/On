package com.example.lunchchoice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.FragmentChaaaaBinding


class Chaaaa : Fragment(), MainDisplay.onBackPressedListener {

    lateinit var binding: FragmentChaaaaBinding

    override fun onBackPresseda() {
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentChaaaaBinding.inflate(inflater, container, false)


        val profilelist = arrayListOf(

            ItemList(R.drawable.meratang, "마라탕"),
            ItemList(R.drawable.jjajang, "짜장면"),
            ItemList(R.drawable.jjambb, "짬뽕"),
            ItemList(R.drawable.wudong, "중국우동"),
            ItemList(R.drawable.ulem, "울면"),
            ItemList(R.drawable.dems, "딤섬"),
            ItemList(R.drawable.cun, "춘권"),
            ItemList(R.drawable.uren, "유린기"),
            ItemList(R.drawable.gochu, "고추잡채"),
            ItemList(R.drawable.gunm, "군만두"),
            ItemList(R.drawable.ues, "유산슬"),
            ItemList(R.drawable.zunng, "전가복"),
            ItemList(R.drawable.reso, "라조기"),
            ItemList(R.drawable.nanz, "난자완스"),
            ItemList(R.drawable.palb, "팔보채"),
            ItemList(R.drawable.gism, "기스면"),
            ItemList(R.drawable.chill, "칠리새우"),
            ItemList(R.drawable.creams, "크림새우"),
            ItemList(R.drawable.mapa, "마파두부"),
            ItemList(R.drawable.ccanp, "깐풍기"),
            ItemList(R.drawable.toma, "계란토마토볶음밥"),
            ItemList(R.drawable.jjapcho, "잡채볶음밥"),
            ItemList(R.drawable.ttang, "탕수육"),
            ItemList(R.drawable.eanz, "양장피"),
            ItemList(R.drawable.ggub, "꿔바로우"),
            ItemList(R.drawable.qqq, "베이징덕"),
            ItemList(R.drawable.dongpa, "동파육")

        )



        binding.recyclerHorizon7.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon7.setHasFixedSize(true)
        binding.recyclerHorizon7.adapter = Exem(profilelist)





        return binding.root

    }


}