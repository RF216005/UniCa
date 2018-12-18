@file:Suppress("UNREACHABLE_CODE")
package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home_shop.*
import org.jetbrains.anko.startActivity

class HomeShop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_shop)

        scan.setOnClickListener {
            startActivity<QRcodeScan>()
        }

        button2.setOnClickListener {
            startActivity<CouponSetting>()
        }


        info.setOnClickListener {
            startActivity<MessageList>()
        }
    }
}
