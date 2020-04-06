package com.zakia.idn.calculatorapps.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zakia.idn.calculatorapps.BangunDatar.*


class BangunDatarAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val pager = listOf(
        JajarGenjangFragment(),
        PersegiFragment(),
        PersegiPanjangFragment(),
        SegitigaFragment(),
        TrapesiumFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pager[position]
    }

    override fun getCount(): Int {
        return pager.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Jajar Genjang"
            1 -> "Persegi"
            2 -> "Persegi Panjang"
            3 -> "Segitiga"
            else -> "Trapesium"
        }
    }
}