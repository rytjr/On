package com.example.lunchchoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchchoice.databinding.ActivityReciclerBinding

class Recicler : AppCompatActivity() {

    private var mBinding: ActivityReciclerBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityReciclerBinding.inflate(layoutInflater)

        val profilelist = arrayListOf(

            ItemList(R.drawable.bulgojo, "불고기"),
            ItemList(R.drawable.gimbab, "김밥"),
            ItemList(R.drawable.bakban, "백반"),
            ItemList(R.drawable.gondre, "곤드레밥"),
            ItemList(R.drawable.kimchibocknuboob, "김치볶음밥"),
            ItemList(R.drawable.jeuekbocknm, "제육볶음"),
            ItemList(R.drawable.osingabock, "오징어볶음"),
            ItemList(R.drawable.jjajanbock, "짜장밥"),
            ItemList(R.drawable.jjambbobgbab, "짬뽕밥"),
            ItemList(R.drawable.kererece, "카레라이스"),
            ItemList(R.drawable.omerece, "오므라이스"),
            ItemList(R.drawable.chikendepbab, "치킨마요덮밥"),
            ItemList(R.drawable.spemmeeo, "스팸마요덮밥"),
            ItemList(R.drawable.dackjook, "닭죽"),
            ItemList(R.drawable.janbookjuk, "전복죽"),
            ItemList(R.drawable.mookbab, "묵밥"),
            ItemList(R.drawable.nase, "나시고랭"),
            ItemList(R.drawable.ddulgalbe, "떡갈비"),
            ItemList(R.drawable.sutbul, "숯불갈비"),
            ItemList(R.drawable.galbejjji, "갈비찜"),
            ItemList(R.drawable.dackgalbe, "닭갈비"),
            ItemList(R.drawable.dackdoretang, "닭도리탕"),
            ItemList(R.drawable.goding, "고등어구이"),
            ItemList(R.drawable.galchi, "갈치조림"),
            ItemList(R.drawable.nakkgi, "낚지볶음"),
            ItemList(R.drawable.golnbe, "굴비구이"),
            ItemList(R.drawable.hamoljjim, "해물찜"),
            ItemList(R.drawable.ssambab, "쌈밥"),
            ItemList(R.drawable.sogogijumgol, "소고기전골"),
            ItemList(R.drawable.dobujo, "두부조림"),
            ItemList(R.drawable.garenmel, "계란말이"),
            ItemList(R.drawable.jjangjo, "장조림"),
            ItemList(R.drawable.jabci, "잡채"),
            ItemList(R.drawable.ganjang, "간장계란밥"),
            ItemList(R.drawable.alebab, "알밥"),
            ItemList(R.drawable.lagal, "LA갈비"),
            ItemList(R.drawable.origu, "오리구이"),
            ItemList(R.drawable.ggejang, "게장"),
            ItemList(R.drawable.ggomak, "꼬막무침"),
            ItemList(R.drawable.mapa, "마파두부"),
            ItemList(R.drawable.toma, "계란토마토볶음밥"),
            ItemList(R.drawable.jjapcho, "잡채볶음밥"),
            ItemList(R.drawable.dongpa, "동파육"),
            ItemList(R.drawable.chobab, "초밥"),
            ItemList(R.drawable.onigi, "오니기리"),
            ItemList(R.drawable.anea, "연어덮밥"),
            ItemList(R.drawable.gachi, "가츠동"),
            ItemList(R.drawable.janga, "장어덮밥"),
            ItemList(R.drawable.bibam, "비빔밥")

        )

        binding.recyclerHorizon.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHorizon.setHasFixedSize(true)
        binding.recyclerHorizon.adapter = Exem(profilelist)




        setContentView(binding.root)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}