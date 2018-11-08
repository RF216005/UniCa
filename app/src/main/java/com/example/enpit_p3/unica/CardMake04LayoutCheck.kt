package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_make04_layout_check.*
import org.jetbrains.anko.startActivity

class CardMake04LayoutCheck : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make04_layout_check)

        back4.setOnClickListener {}

        next4.setOnClickListener {
            startActivity<CardMake05FeePlan>()
        }
    }
}
