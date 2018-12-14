package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_make01_register_shop.*
import org.jetbrains.anko.startActivity

class CardMake01RegisterShop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make01_register_shop)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val shopName = pref.getString("SHOP_NAME", "")
        val shopAddress = pref.getString("SHOP_ADDRESS", "")
        val shopTell = pref.getString("SHOP_TELL", "")

        next1.setOnClickListener {
            startActivity<CardMake02Type>()
            saveData()
        }

        back1.setOnClickListener {
            startActivity<Select>()
        }
    }

    private fun saveData() {

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.putString("SHOP_NAME", data1.text.toString())
                .putString("SHOP_ADDRESS", data2.text.toString())
                .putString("SHOP_TELL", data3.text.toString())
                .apply()
    }
}
