package com.example.lunchchoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.ActivityWestBinding

class West : AppCompatActivity() {

    private var mBinding: ActivityWestBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityWestBinding.inflate(layoutInflater)

        val profilelist = arrayListOf(


            ItemList(R.drawable.rees, "리조또"),
            ItemList(R.drawable.chikkken, "치킨"),
            ItemList(R.drawable.babk, "바베큐"),
            ItemList(R.drawable.hatd, "핫도그"),
            ItemList(R.drawable.gamb, "감바스"),
            ItemList(R.drawable.sop, "스프"),
            ItemList(R.drawable.gtas, "그라탕"),
            ItemList(R.drawable.panc, "팬케이크"),
            ItemList(R.drawable.walp, "와플"),
            ItemList(R.drawable.bban, "빵"),
            ItemList(R.drawable.scon, "스콘"),
            ItemList(R.drawable.down, "도넛"),
            ItemList(R.drawable.toste, "토스트"),
            ItemList(R.drawable.hambugar, "햄버거"),
            ItemList(R.drawable.pia, "피자"),
            ItemList(R.drawable.past, "파스타"),
            ItemList(R.drawable.stak, "스테이크"),
            ItemList(R.drawable.sand, "샌드위치"),
            ItemList(R.drawable.selr, "샐러드")

        )

        binding.recyclerHorizon10.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon10.setHasFixedSize(true)
        binding.recyclerHorizon10.adapter = Exem(profilelist)




        setContentView(binding.root)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}