package com.example.lunchchoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.lunchchoice.databinding.ActivityMainDisplayBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.material.navigation.NavigationView
import java.util.*

class MainDisplay : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var mBinding: ActivityMainDisplayBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainDisplayBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnNavi.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        binding.btn7.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        binding.naviView.setNavigationItemSelectedListener(this)

        binding.naviView.setItemIconTintList(null)

        val intent1 = Intent(this, Recicler::class.java)
        binding.btn1.setOnClickListener{
            startActivity(intent1)
        }

        val intent2 = Intent(this, Noobles::class.java)
        binding.btn3.setOnClickListener {
            startActivity(intent2)
        }

        val intent3 = Intent(this, Tang::class.java)
        binding.btn2.setOnClickListener {
            startActivity(intent3)
        }

        val intent4 = Intent(this, Beadal::class.java)
        binding.btn4.setOnClickListener {
            startActivity(intent4)
        }

        val intent5 = Intent(this, Deasert::class.java)
        binding.btn5.setOnClickListener {
            startActivity(intent5)
        }

        val intent17 = Intent(this, Ran::class.java)
        binding.btn6.setOnClickListener {
            startActivity(intent17)
        }







        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }




    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }


    interface onBackPressedListener {
        fun onBackPresseda()
    }




    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val ft = supportFragmentManager.beginTransaction()
        when(item.itemId) {
            R.id.korea -> ft.replace(R.id.fram, Kraaaaaaa()).commit()
            R.id.chinaaaa -> ft.replace(R.id.fram, Chaaaa()).commit()
            R.id.japenaaaa -> ft.replace(R.id.fram, Jaaaaaa()).commit()
            R.id.eufood -> ft.replace(R.id.fram, Ueeeeeeeeeeeeeee()).commit()
            R.id.diertaaaa -> ft.replace(R.id.fram, Daaaaaaaaaaaaaaa()).commit()
            R.id.asianfoodaaaa -> ft.replace(R.id.fram, Aaaaaaaaaaaa()).commit()
            R.id.ranchienaaaa -> ft.replace(R.id.fram, Rcccccccccccc()).commit()
            R.id.pizzaaaaa -> ft.replace(R.id.fram, Fragmenta()).commit()
            R.id.veganaaaaa-> ft.replace(R.id.fram, Vaaaaaaaaaaaa()).commit()

        }
        binding.drawerLayout.closeDrawers()
        return false
    }

    override fun onBackPressed() {

        val fragmentList = supportFragmentManager.fragments
        for (fragment in fragmentList) {
            if (fragment is onBackPressedListener) {
                (fragment as onBackPressedListener).onBackPresseda()
                return
            }
        }
        if(binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawers()

        }
        else {
            super.onBackPressed()
        }
    }
}