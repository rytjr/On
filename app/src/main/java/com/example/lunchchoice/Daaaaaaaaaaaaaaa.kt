package com.example.lunchchoice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.FragmentDaaaaaaaaaaaaaaaBinding


class Daaaaaaaaaaaaaaa : Fragment(), MainDisplay.onBackPressedListener {

    lateinit var binding: FragmentDaaaaaaaaaaaaaaaBinding

    override fun onBackPresseda() {
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDaaaaaaaaaaaaaaaBinding.inflate(inflater, container, false)


        val profilelist = arrayListOf(

            ItemList(R.drawable.gasm, "닭가슴살"),
            ItemList(R.drawable.ggm, "고구마"),
            ItemList(R.drawable.hom, "호밀빵"),
            ItemList(R.drawable.tong, "통곡물 시리얼"),
            ItemList(R.drawable.baan, "바나나"),
            ItemList(R.drawable.dobb, "두부"),
            ItemList(R.drawable.ww, "소고기"),
            ItemList(R.drawable.genn, "견과류"),
            ItemList(R.drawable.bitm, "종합비타민"),
            ItemList(R.drawable.weln, "월남쌈"),
            ItemList(R.drawable.sabb, "샤브샤브"),
            ItemList(R.drawable.engb, "양배추쌈"),
            ItemList(R.drawable.selr, "샐러드")

        )



        binding.recyclerHorizon11.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon11.setHasFixedSize(true)
        binding.recyclerHorizon11.adapter = Exem(profilelist)





        return binding.root

    }


}