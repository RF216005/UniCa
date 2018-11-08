package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.register_shop.*
import org.jetbrains.anko.startActivity

class CardMake : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_shop)

        next1.setOnClickListener {
            startActivity<CardMake01>()

            //test
        }
    }
}
