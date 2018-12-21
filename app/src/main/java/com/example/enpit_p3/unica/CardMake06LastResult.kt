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

        val shopService = pref.getString("SHOP_SERVICE", "")
        val shopService2 = pref.getString("SHOP_SERVICE2","")
        val shopService3 = pref.getString("SHOP_SERVICE3","")
        val shopContents = pref.getString("SHOP_CONTENTS","")
        val itemName = pref.getString("ITEM_NAME","")

        couponCheck1.text = shopService
        couponCheck2.text = shopService2
        couponCheck3.text = shopService3
        prCheck.text  = shopContents

        shop_name.text = shopName
        textView8.text = shopAddress
        textView11.text = shopTell
        textView6.text = shopType
        textView7.text = shopFeePlan
        item_name.text = itemName

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
                    val shopcoupon1 = couponCheck1.text.toString()
                    val shopcoupon2 = couponCheck2.text.toString()
                    val shopcoupon3 = couponCheck3.text.toString()
                    val shoppr = prCheck.text.toString()
                    val  itemname = item_name.text.toString()
                    val value11 = "現在投稿されていません"
                    val value12 = "現在投稿されていません"

                    val key1 = "shopname"
                    val key2 = "shopadress"
                    val key3 = "shoptell"
                    val key4 = "shoptype"
                    val key5 = "shopfeeplan"
                    val key6 = "coupon1"
                    val key7 = "coupon2"
                    val key8 = "coupon3"
                    val key9 = "pr"
                    val key10 = "recommended"
                    val key11 = "title"
                    val key12 = "detail"


                    val database = FirebaseDatabase.getInstance()
                    val ref1 = database.getReference(key1)
                    val ref2 = database.getReference(key2)
                    val ref3 = database.getReference(key3)
                    val ref4 = database.getReference(key4)
                    val ref5 = database.getReference(key5)
                    val ref6 = database.getReference(key6)
                    val ref7 = database.getReference(key7)
                    val ref8 = database.getReference(key8)
                    val ref9 = database.getReference(key9)
                    val ref10 = database.getReference(key10)
                    val ref11 = database.getReference(key11)
                    val ref12 = database.getReference(key12)

                    ref1.setValue(shopname)
                    ref2.setValue(shopadress)
                    ref3.setValue(shoptell)
                    ref4.setValue(shoptype)
                    ref5.setValue(shopfeeplan)
                    ref6.setValue(shopcoupon1)
                    ref7.setValue(shopcoupon2)
                    ref8.setValue(shopcoupon3)
                    ref9.setValue(shoppr)
                    ref10.setValue(itemname)
                    ref11.setValue(value11)
                    ref12.setValue(value12)

                    finish()
                    startActivity<HomeShop>()
                }
            }.show()
        }
    }
}

