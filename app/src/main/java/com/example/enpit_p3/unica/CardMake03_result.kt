package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.result.*
import org.jetbrains.anko.startActivity

class CardMake03_result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make03_result)

        back4.setOnClickListener {}

        next4.setOnClickListener {
            startActivity<CardMake04_FeePlan>()
        }
    }
}
