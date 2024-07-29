package com.example.lunchchoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.ActivityDeasertBinding

class Deasert : AppCompatActivity() {

    private var mBinding: ActivityDeasertBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityDeasertBinding.inflate(layoutInflater)

        val profilelist = arrayListOf(

            ItemList(R.drawable.markl, "마카롱"),
            ItemList(R.drawable.darku, "다쿠아즈"),
            ItemList(R.drawable.stang, "사탕"),
            ItemList(R.drawable.hodop, "호두파이"),
            ItemList(R.drawable.mase, "마시멜로"),
            ItemList(R.drawable.rare, "에그타르트"),
            ItemList(R.drawable.cakee, "초코케이크"),
            ItemList(R.drawable.chez, "치즈케이크"),
            ItemList(R.drawable.panc, "팬케이크"),
            ItemList(R.drawable.walp, "와플"),
            ItemList(R.drawable.corp, "크로플"),
            ItemList(R.drawable.usep, "요플레"),
            ItemList(R.drawable.tea, "차"),
            ItemList(R.drawable.oos, "요구르트"),
            ItemList(R.drawable.braw, "브라우니"),
            ItemList(R.drawable.tansn, "탄산음료"),
            ItemList(R.drawable.choccl, "초콜릿"),
            ItemList(R.drawable.gaja, "과자"),
            ItemList(R.drawable.gil, "과일"),
            ItemList(R.drawable.bub, "버블티"),
            ItemList(R.drawable.ddokk, "떡"),
            ItemList(R.drawable.hul, "탕후루"),
            ItemList(R.drawable.scon, "스콘"),
            ItemList(R.drawable.teg, "우유튀김"),
            ItemList(R.drawable.pod, "푸딩"),
            ItemList(R.drawable.feee, "커피"),
            ItemList(R.drawable.hare, "젤리"),
            ItemList(R.drawable.icec, "아이스크림"),
            ItemList(R.drawable.bban, "빵"),
            ItemList(R.drawable.down, "도넛"),
            ItemList(R.drawable.mare, "머랭쿠키"),
            ItemList(R.drawable.mardl, "마들렌")

        )

        binding.recyclerHorizon4.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon4.setHasFixedSize(true)
        binding.recyclerHorizon4.adapter = Exem(profilelist)




        setContentView(binding.root)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}