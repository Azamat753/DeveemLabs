package com.lawlett.deveemlabs.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.lawlett.deveemlabs.R
import com.lawlett.deveemlabs.adapter.PagerAdapter
import com.lawlett.deveemlabs.extensions.gone
import com.lawlett.deveemlabs.extensions.visible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager.adapter = PagerAdapter(supportFragmentManager)
        tab_layout.setupWithViewPager(pager)
    }
}