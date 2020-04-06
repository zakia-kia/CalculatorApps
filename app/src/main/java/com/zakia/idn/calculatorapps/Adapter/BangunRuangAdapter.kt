package com.zakia.idn.calculatorapps.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zakia.idn.calculatorapps.BangunRuang.*

class BangunRuangAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val pager = listOf(
        KubusFragment(),
        BalokFragment(),
        TabungFragment(),
        KerucutFragment(),
        PrismaFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pager[position]
    }

    override fun getCount(): Int {
        return pager.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "kubus"
            1 -> "balok"
            2 -> "Tabung"
            3 -> "Kerucut"
            else -> "Prisma"
        }
    }

}