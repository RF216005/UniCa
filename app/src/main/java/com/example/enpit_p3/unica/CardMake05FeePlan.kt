package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_card_make05_fee_plan.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.yesButton

class CardMake05FeePlan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make05_fee_plan)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val shopFeePlan = pref.getString("SHOP_FEE_PLAN", "")
        var planFrag = 0

        back5.setOnClickListener {
            startActivity<CardMake04LayoutCheck>()
        }

        next5.setOnClickListener {
            if(planFrag == 1) {
                pref.edit()
                        .putString("SHOP_FEE_PLAN", textView5.text.toString())
                        .apply()
                startActivity<CardMake06LastResult>()
            } else {
                alert {
                    alert("プランを選択してください。"){
                        yesButton {}
                    }.show()
                }
            }
        }

        radioGroup2.setOnCheckedChangeListener {
            group, checkedId ->
                textView5.text = findViewById<RadioButton>(checkedId).text
            planFrag = 1
        }
    }
}
