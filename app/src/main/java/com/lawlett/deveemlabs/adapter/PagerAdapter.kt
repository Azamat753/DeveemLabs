package com.lawlett.deveemlabs.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.lawlett.deveemlabs.remain.RemainFragment
import com.lawlett.deveemlabs.selhoz.SelhozFragment
import com.lawlett.deveemlabs.home.HomeFragment

class PagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                SelhozFragment()
            }
            2 -> {
                RemainFragment()
            }
            else -> {
                HomeFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> {
                return "\uD83D\uDC2E Агробазар"
            }
            1 -> {
                return "\uD83D\uDE9C Сельхоз техника"
            }
            2->{
                return "⚒ Строительный материалы"
            }
        }
        return super.getPageTitle(position)
    }
}