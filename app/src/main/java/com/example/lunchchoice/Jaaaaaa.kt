package com.example.lunchchoice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.FragmentJaaaaaaBinding


class Jaaaaaa : Fragment(), MainDisplay.onBackPressedListener {

    lateinit var binding: FragmentJaaaaaaBinding

    override fun onBackPresseda() {
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentJaaaaaaBinding.inflate(inflater, container, false)


        val profilelist = arrayListOf(

            ItemList(R.drawable.eeeeeeeeeeeee, "라멘"),
            ItemList(R.drawable.nagas, "나가사키짬뽕"),
            ItemList(R.drawable.memeals, "메밀소바"),
            ItemList(R.drawable.bbbokem, "볶음우동"),
            ItemList(R.drawable.donc, "돈카츠"),
            ItemList(R.drawable.hss, "회"),
            ItemList(R.drawable.wmb, "우메보시"),
            ItemList(R.drawable.gaae, "가라아게"),
            ItemList(R.drawable.okn, "오코노미야끼"),
            ItemList(R.drawable.sky, "스키야끼"),
            ItemList(R.drawable.odt, "오뎅탕"),
            ItemList(R.drawable.yaj, "야키토리"),
            ItemList(R.drawable.denp, "덴푸라"),
            ItemList(R.drawable.tag, "타코야끼"),
            ItemList(R.drawable.yak, "야키니쿠"),
            ItemList(R.drawable.ged, "규동"),
            ItemList(R.drawable.nato, "낫토"),
            ItemList(R.drawable.chobab, "초밥"),
            ItemList(R.drawable.onigi, "오니기리"),
            ItemList(R.drawable.anea, "연어덮밥"),
            ItemList(R.drawable.gachi, "가츠동"),
            ItemList(R.drawable.janga, "장어덮밥"),
            ItemList(R.drawable.nabea, "나베")

        )



        binding.recyclerHorizon8.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon8.setHasFixedSize(true)
        binding.recyclerHorizon8.adapter = Exem(profilelist)





        return binding.root

    }


}