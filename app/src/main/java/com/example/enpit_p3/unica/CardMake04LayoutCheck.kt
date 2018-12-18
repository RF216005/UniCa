package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_make04_layout_check.*
import org.jetbrains.anko.startActivity

class CardMake04LayoutCheck : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make04_layout_check)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)

        val shopService = pref.getString("SHOP_SERVICE", "")
        val shopService2 = pref.getString("SHOP_SERVICE2","")
        val shopService3 = pref.getString("SHOP_SERVICE3","")
        val shopContents = pref.getString("SHOP_CONTENTS","")

        textView.text = shopService
        textView1.text = shopService2
        textView3.text = shopService3
        textView13.text  = shopContents


        back4.setOnClickListener {
            startActivity<CardMake03Layout>()
        }

        next4.setOnClickListener {
            startActivity<CardMake05FeePlan>()
        }
    }
}
