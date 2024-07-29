package com.example.lunchchoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.ActivityBeadalBinding

class Beadal : AppCompatActivity() {

    private var mBinding: ActivityBeadalBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityBeadalBinding.inflate(layoutInflater)

        val profilelist = arrayListOf(

            ItemList(R.drawable.chikkken, "치킨"),
            ItemList(R.drawable.nangm, "냉면"),
            ItemList(R.drawable.toste, "토스트"),
            ItemList(R.drawable.mealmen, "밀면"),
            ItemList(R.drawable.sutbul, "숯불갈비"),
            ItemList(R.drawable.galbejjji, "갈비찜"),
            ItemList(R.drawable.dackdore, "닭도리탕"),
            ItemList(R.drawable.hamoljjim, "해물찜"),
            ItemList(R.drawable.alebab, "알밥"),
            ItemList(R.drawable.chobab, "초밥"),
            ItemList(R.drawable.konggoo, "콩국수"),
            ItemList(R.drawable.jjolme, "쫄면"),
            ItemList(R.drawable.jjajang, "짜장면"),
            ItemList(R.drawable.jjambb, "짬뽕"),
            ItemList(R.drawable.memeals, "메밀소바"),
            ItemList(R.drawable.gobch, "곱창"),
            ItemList(R.drawable.mackchabg, "막창"),
            ItemList(R.drawable.uckh, "육회"),
            ItemList(R.drawable.jokb, "족발"),
            ItemList(R.drawable.bossamm, "보쌈"),
            ItemList(R.drawable.ddackba, "닭발"),
            ItemList(R.drawable.molha, "물회"),
            ItemList(R.drawable.hambugar, "햄버거"),
            ItemList(R.drawable.pia, "피자"),
            ItemList(R.drawable.ssalgok, "쌀국수")

            )

        binding.recyclerHorizon3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon3.setHasFixedSize(true)
        binding.recyclerHorizon3.adapter = Exem(profilelist)




        setContentView(binding.root)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}