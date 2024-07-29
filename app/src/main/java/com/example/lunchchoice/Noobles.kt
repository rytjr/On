package com.example.lunchchoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.ActivityNooblesBinding

class Noobles : AppCompatActivity() {

    private var mBinding: ActivityNooblesBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityNooblesBinding.inflate(layoutInflater)

        val profilelist = arrayListOf(

            ItemList(R.drawable.dackgooksu, "닭국수"),
            ItemList(R.drawable.gogigookwu, "고기국수"),
            ItemList(R.drawable.bibimgoo, "비빔국수"),
            ItemList(R.drawable.ealmo, "열무국수"),
            ItemList(R.drawable.past, "파스타"),
            ItemList(R.drawable.mackgoo, "막국수"),
            ItemList(R.drawable.jamchi, "잔치국수"),
            ItemList(R.drawable.nangm, "냉면"),
            ItemList(R.drawable.golbang, "골뱅이소면"),
            ItemList(R.drawable.mealmen, "밀면"),
            ItemList(R.drawable.konggoo, "콩국수"),
            ItemList(R.drawable.rema, "라면"),
            ItemList(R.drawable.jjolme, "쫄면"),
            ItemList(R.drawable.suja, "수제비"),
            ItemList(R.drawable.jjajang, "짜장면"),
            ItemList(R.drawable.jjambb, "짬뽕"),
            ItemList(R.drawable.wudong, "중국우동"),
            ItemList(R.drawable.ulem, "울면"),
            ItemList(R.drawable.gism, "기스면"),
            ItemList(R.drawable.eeeeeeeeeeeee, "라멘"),
            ItemList(R.drawable.nagas, "나가사키짬뽕"),
            ItemList(R.drawable.memeals, "메밀소바"),
            ItemList(R.drawable.bbbokem, "볶음우동"),
            ItemList(R.drawable.ssalgok, "쌀국수")

        )

        binding.recyclerHorizon1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon1.setHasFixedSize(true)
        binding.recyclerHorizon1.adapter = Exem(profilelist)




        setContentView(binding.root)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}