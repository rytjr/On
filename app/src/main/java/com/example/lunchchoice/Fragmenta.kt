package com.example.lunchchoice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.FragmentFragmentaBinding


class Fragmenta : Fragment(), MainDisplay.onBackPressedListener {

    lateinit var binding: FragmentFragmentaBinding

    override fun onBackPresseda() {
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFragmentaBinding.inflate(inflater, container, false)


        val profilelist = arrayListOf(

            ItemList(R.drawable.domin, "도미노 피자 포테이토 피자"),
            ItemList(R.drawable.albo, "피자알볼로 조각별다른토핑"),
            ItemList(R.drawable.vvvvvvvvvvvvvk, "7번가피자 샘스테이크"),
            ItemList(R.drawable.gomaa, "피자스쿨 고구마피자"),
            ItemList(R.drawable.xxxxxxxxxk, "피자마루 시카고피자"),
            ItemList(R.drawable.toooooooooooopk, "피자헛 토핑킹"),
            ItemList(R.drawable.dannnnnnm, "59쌀피자 반미터피자"),
            ItemList(R.drawable.suuuuuups, "파파존스 아이리쉬포테이토"),
            ItemList(R.drawable.potenn, "반올림피자샵 포텐피자"),
            ItemList(R.drawable.jikk, "피자헛 직화불고기"),
            ItemList(R.drawable.blak, "도미노피자 블랙앵거스"),
            ItemList(R.drawable.pppppppppas, "파파존스 슈퍼파파스"),
            ItemList(R.drawable.ppel, "피자마루 페페로니치즈폭탄피자"),
            ItemList(R.drawable.pppppppppppppppppp, "도미노 베이컨체다치즈"),
            ItemList(R.drawable.okksu, "피자알볼로 옥수수피자")

        )




        binding.recyclerHorizon21.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon21.setHasFixedSize(true)
        binding.recyclerHorizon21.adapter = Exem(profilelist)





        return binding.root

    }




}