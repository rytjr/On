package com.example.lunchchoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.ActivityTangBinding

class Tang : AppCompatActivity() {

    private var mBinding: ActivityTangBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityTangBinding.inflate(layoutInflater)

        val profilelist = arrayListOf(

            ItemList(R.drawable.samge, "삼계탕"),
            ItemList(R.drawable.sund, "순댓국"),
            ItemList(R.drawable.kongnamel, "콩나물국밥"),
            ItemList(R.drawable.mand, "만둣국"),
            ItemList(R.drawable.hajang, "해장국"),
            ItemList(R.drawable.galbtang, "갈비탕"),
            ItemList(R.drawable.gamja, "감자탕"),
            ItemList(R.drawable.gomta, "곰탕"),
            ItemList(R.drawable.sullang, "설렁탕"),
            ItemList(R.drawable.chua, "추어탕"),
            ItemList(R.drawable.kimccccci, "김치찌개"),
            ItemList(R.drawable.danja, "된장찌개"),
            ItemList(R.drawable.budajj, "부대찌개"),
            ItemList(R.drawable.chonggo, "청국장"),
            ItemList(R.drawable.meuckg, "미역국"),
            ItemList(R.drawable.sssssssssssssssssss, "소고기무국"),
            ItemList(R.drawable.meratang, "마라탕"),
            ItemList(R.drawable.nabea, "나베"),
            ItemList(R.drawable.ddomna, "똠냥꿍")

            )

        binding.recyclerHorizon2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon2.setHasFixedSize(true)
        binding.recyclerHorizon2.adapter = Exem(profilelist)




        setContentView(binding.root)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}