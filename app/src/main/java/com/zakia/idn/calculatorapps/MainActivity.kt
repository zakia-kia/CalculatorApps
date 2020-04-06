package com.zakia.idn.calculatorapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.mn_dtr -> {
                    val fragmentBD = BangunDatarFragment()
                    addFragment(fragmentBD)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.mn_rng -> {
                    val fragmentBR = BangunRuangFragment()
                    addFragment(fragmentBR)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun addFragment(fragmentBD: BangunDatarFragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fm, fragmentBD, fragmentBD::class.java.simpleName).commit()
    }

    private fun addFragment(fragmentBR: BangunRuangFragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fm, fragmentBR, fragmentBR::class.java.simpleName).commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_main.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        val mainFragment = BangunDatarFragment.newInstance()
        addFragment(mainFragment)

    }
}
