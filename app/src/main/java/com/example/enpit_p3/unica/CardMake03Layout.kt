package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_make03_layout.*
import org.jetbrains.anko.startActivity

class CardMake03Layout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make03_layout)



        next3.setOnClickListener {
            saveData()
            startActivity<CardMake04LayoutCheck>()
        }

        back3.setOnClickListener {
            startActivity<CardMake02Type>()
        }
    }

    private fun saveData() {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val shopService = pref.getString("SHOP_SERVICE", "")
        val shopService2 = pref.getString("SHOP_SERVICE2","")
        val shopService3 = pref.getString("SHOP_SERVICE3","")
        val shopContents = pref.getString("SHOP_CONTENTS","")

        val editor = pref.edit()
                .putString("SHOP_SERVICE", editText.text.toString())
                .putString("SHOP_SERVICE2", editText2.text.toString())
                .putString("SHOP_SERVICE3", editText4.text.toString())
                .putString("SHOP_CONTENTS", editText5.text.toString())
                .apply()
    }
}
