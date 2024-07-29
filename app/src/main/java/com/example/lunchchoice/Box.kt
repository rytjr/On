package com.example.lunchchoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.ActivityBoxBinding

class Box : AppCompatActivity() {

    private var mBinding: ActivityBoxBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityBoxBinding.inflate(layoutInflater)

        val profilelist = arrayListOf(

            ItemList(R.drawable.domin, "도미노 피자 포테이토 피자"),
            ItemList(R.drawable.albo, "피자알볼로 조각별 다른 토핑"),
            ItemList(R.drawable.gomaa, "피자스쿨 고구마피자"),
            ItemList(R.drawable.potenn, "반올림피자샵 포텐피자"),
            ItemList(R.drawable.jikk, "피자헛 직화불고기"),
            ItemList(R.drawable.blak, "도미노피자 블랙앵거스"),
            ItemList(R.drawable.ppel, "피자마루 페페로니치즈폭탄피자"),
            ItemList(R.drawable.okksu, "피자알볼로 옥수수피자")

        )

        binding.recyclerHorizon17.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon17.setHasFixedSize(true)
        binding.recyclerHorizon17.adapter = Exem(profilelist)




        setContentView(binding.root)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}