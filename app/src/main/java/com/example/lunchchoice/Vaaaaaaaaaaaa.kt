package com.example.lunchchoice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.FragmentVaaaaaaaaaaaaBinding


class Vaaaaaaaaaaaa : Fragment(), MainDisplay.onBackPressedListener {

    lateinit var binding: FragmentVaaaaaaaaaaaaBinding

    override fun onBackPresseda() {
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentVaaaaaaaaaaaaBinding.inflate(inflater, container, false)


        val profilelist = arrayListOf(

            ItemList(R.drawable.ggm, "채소"),
            ItemList(R.drawable.hom, "호밀빵"),
            ItemList(R.drawable.tong, "통곡물 시리얼"),
            ItemList(R.drawable.gil, "과일"),
            ItemList(R.drawable.dobb, "두부"),
            ItemList(R.drawable.genn, "견과류"),
            ItemList(R.drawable.weln, "월남쌈"),
            ItemList(R.drawable.engb, "양배추쌈"),
            ItemList(R.drawable.pla, "식물성고기"),
            ItemList(R.drawable.ppppppppppppppppp, "계란"),
            ItemList(R.drawable.seaa, "씨앗"),
            ItemList(R.drawable.ggll, "꿀"),
            ItemList(R.drawable.selr, "샐러드")

        )



        binding.recyclerHorizon12.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon12.setHasFixedSize(true)
        binding.recyclerHorizon12.adapter = Exem(profilelist)





        return binding.root

    }


}