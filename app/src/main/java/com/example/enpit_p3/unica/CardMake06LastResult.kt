package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_card_make06_last_result.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.yesButton

class CardMake06LastResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_make06_last_result)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val shopName = pref.getString("SHOP_NAME", "")
        val shopAddress = pref.getString("SHOP_ADDRESS", "")
        val shopTell = pref.getString("SHOP_TELL", "")
        val shopFeePlan = pref.getString("SHOP_FEE_PLAN", "")
        val shopType = pref.getString("SHOP_TYPE", "")

        shop_name.text = shopName
        textView8.text = shopAddress
        textView11.text = shopTell
        textView6.text = shopType
        textView7.text = shopFeePlan


        back6.setOnClickListener {
            startActivity<CardMake05FeePlan>()
        }

        finish2.setOnClickListener {


            alert("登録してよろしいですか？") {
                yesButton {
                    val shopname = shop_name.text.toString()
                    val shopadress = textView8.text.toString()
                    val shoptell = textView11.text.toString()
                    val shoptype = textView6.text.toString()
                    val shopfeeplan = textView7.text.toString()

                    val key1 = "shopname"
                    val key2 = "shopadress"
                    val key3 = "shoptell"
                    val key4 = "shoptype"
                    val key5 = "shopfeeplan"

                    val database = FirebaseDatabase.getInstance()
                    val ref1 = database.getReference(key1)
                    val ref2 = database.getReference(key2)
                    val ref3 = database.getReference(key3)
                    val ref4 = database.getReference(key4)
                    val ref5 = database.getReference(key5)

                    ref1.setValue(shopname)
                    ref2.setValue(shopadress)
                    ref3.setValue(shoptell)
                    ref4.setValue(shoptype)
                    ref5.setValue(shopfeeplan)
                    finish()
                    startActivity<HomeShop>()
                }
            }.show()
        }
    }
}

