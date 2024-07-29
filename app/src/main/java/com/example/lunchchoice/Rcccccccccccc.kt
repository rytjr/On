package com.example.lunchchoice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.FragmentRccccccccccccBinding


class Rcccccccccccc : Fragment(), MainDisplay.onBackPressedListener {

    lateinit var binding: FragmentRccccccccccccBinding

    override fun onBackPresseda() {
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRccccccccccccBinding.inflate(inflater, container, false)


        val profilelist = arrayListOf(

            ItemList(R.drawable.haun, "BBQ 황금올리브"),
            ItemList(R.drawable.bbrn, "BHC 뿌링클"),
            ItemList(R.drawable.orn, "네네치킨 오리앤탈 파닭"),
            ItemList(R.drawable.redc, "교촌치킨 레드콤보"),
            ItemList(R.drawable.per, "페리카나 양념치킨"),
            ItemList(R.drawable.gubn, "굽네치킨 고추바사삭"),
            ItemList(R.drawable.hosk, "호식이 두마리치킨 매운간장치킨"),
            ItemList(R.drawable.match, "BHC 맛초킹"),
            ItemList(R.drawable.spp, "처갓집 슈프림 양념치킨"),
            ItemList(R.drawable.hunyy, "교촌치킨 허니콤보"),
            ItemList(R.drawable.jadm, "자담치킨 맵슐랭"),
            ItemList(R.drawable.eatt, "옛날치킨"),
            ItemList(R.drawable.dddddk, "닭 강정")

        )



        binding.recyclerHorizon13.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon13.setHasFixedSize(true)
        binding.recyclerHorizon13.adapter = Exem(profilelist)





        return binding.root

    }


}