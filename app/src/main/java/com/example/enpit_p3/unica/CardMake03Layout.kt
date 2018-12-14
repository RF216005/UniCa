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

        val pref = PreferenceManager.getDefaultSharedPreferences(this)

        val shopService = pref.getString("SHOP_SERVICE", "")

        next3.setOnClickListener {
            val editor = pref.edit()
                    .putString("SHOP_SERVICE", editText.text.toString())
                    .apply()
            startActivity<CardMake04LayoutCheck>()
        }

        back3.setOnClickListener {
            startActivity<CardMake02Type>()
        }
    }
}
