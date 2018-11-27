package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_card_make02_type.*
import org.jetbrains.anko.startActivity

class CardMake02Type : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make02_type)

        next2.setOnClickListener {
            startActivity<CardMake03Layout>()
        }

        back2.setOnClickListener {
            startActivity<CardMake01RegisterShop>()
        }

        radioGroup.setOnCheckedChangeListener{
            group, checkedId ->
                type.text = findViewById<RadioButton>(checkedId).text
        }
    }
}
