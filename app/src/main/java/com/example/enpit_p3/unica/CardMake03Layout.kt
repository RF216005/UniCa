package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_card_make03_layout.*
import org.jetbrains.anko.startActivity

class CardMake03Layout : AppCompatActivity() {
    private lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make03_layout)

        next3.setOnClickListener {
            startActivity<CardMake04LayoutCheck>()
        }

        back3.setOnClickListener {
            startActivity<CardMake02Type>()
        }
    }
}
