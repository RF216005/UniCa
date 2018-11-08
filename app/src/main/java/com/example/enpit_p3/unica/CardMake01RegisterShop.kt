package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_make01_register_shop.*
import org.jetbrains.anko.startActivity

class CardMake01RegisterShop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make01_register_shop)

        next1.setOnClickListener {
            startActivity<CardMake02Type>() 
        }
    }
}
