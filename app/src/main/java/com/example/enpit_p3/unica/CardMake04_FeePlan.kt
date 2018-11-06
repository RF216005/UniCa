package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.fee_plan.*
import org.jetbrains.anko.startActivity

class CardMake04_FeePlan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make04__fee_plan)

        back5.setOnClickListener {
            startActivity<CardMake03_result>()
        }

        next5.setOnClickListener {
            startActivity<CardMake05_LastResult>()
        }
    }
}
