package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_card_make05_fee_plan.*
import org.jetbrains.anko.startActivity

class CardMake05FeePlan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make05_fee_plan)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val shopFeePlan = pref.getString("SHOP_FEE_PLAN", "")

        back5.setOnClickListener {
            startActivity<CardMake04LayoutCheck>()
        }

        next5.setOnClickListener {
            pref.edit()
                    .putString("SHOP_FEE_PLAN", textView5.text.toString())
                    .apply()
            startActivity<CardMake06LastResult>()
        }

        radioGroup2.setOnCheckedChangeListener {
            group, checkedId ->
                textView5.text = findViewById<RadioButton>(checkedId).text
        }
    }
}
