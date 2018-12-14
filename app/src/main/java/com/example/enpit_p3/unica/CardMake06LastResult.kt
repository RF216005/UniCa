package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_make06_last_result.*
import org.jetbrains.anko.startActivity

class CardMake06LastResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make06_last_result)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val shopName = pref.getString("SHOP_NAME", "")
        val shopAddress = pref.getString("SHOP_ADDRESS", "")
        val shopTell = pref.getString("SHOP_TELL", "")
        val shopFeePlan = pref.getString("SHOP_FEE_PLAN", "")
        val shopType = pref.getString("SHOP_TYPE", "")

        shop_name.text = shopName
        textView8.text = shopAddress
        textView11.text = shopTell
        textView6.text = shopType
        textView7.text = shopFeePlan


        back6.setOnClickListener {
            startActivity<CardMake05FeePlan>()
        }

        finish2.setOnClickListener {
            startActivity<HomeShop>()
        }
    }

}
