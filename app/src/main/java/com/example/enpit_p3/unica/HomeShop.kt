@file:Suppress("UNREACHABLE_CODE")
package com.example.enpit_p3.unica

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home_shop.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.yesButton

class HomeShop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_shop)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val loginFrag = pref.getInt("LOGIN_FRAG", 0)
        val shopFeePlan = pref.getString("SHOP_FEE_PLAN", "")

        scan.setOnClickListener {
            if(shopFeePlan != "フリープラン　無料/月") {
                startActivity<QRcodeScan>()
            } else {
                alert("シルバープラン以上で使用可能になります。") {
                    yesButton {}
                }.show()
            }
        }

        button2.setOnClickListener {
            startActivity<CouponSetting>()
        }


        info.setOnClickListener {
            if(shopFeePlan != "フリープラン　無料/月"){
                startActivity<MessageList>()
            } else {
                alert("シルバープラン以上で使用可能になります。") {
                    yesButton {}
                }.show()
            }
        }

        logout.setOnClickListener {
            alert("ログアウトします。") {
                yesButton {
                    pref.edit()
                            .putInt("LOGIN_FRAG", 2)
                            .apply()
                    startActivity<Select>()
                }
                noButton {}
            }.show()
        }
    }
}
