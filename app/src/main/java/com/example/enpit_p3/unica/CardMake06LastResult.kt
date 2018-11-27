package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_make06_last_result.*
import org.jetbrains.anko.startActivity

class CardMake06LastResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make06_last_result)

        back6.setOnClickListener {
            startActivity<CardMake05FeePlan>()
        }

        finish2.setOnClickListener {
            startActivity<HomeShop>()
        }


    }
}
