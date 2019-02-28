package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_select.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.yesButton

class Select : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        val pref =PreferenceManager.getDefaultSharedPreferences(this)
        val loginFrag = pref.getInt("LOGIN_FRAG", 0)

        if(loginFrag == 1) {
            startActivity<HomeShop>()
        }

        shop.setOnClickListener {
            startActivity<CardMake01RegisterShop>()
        }

        login.setOnClickListener {
            if(loginFrag != 0) {
                startActivity<HomeShop>()
            } else {
                alert("店舗登録をしてください。") {
                    yesButton {  }
                }.show()
            }
        }
    }
}
