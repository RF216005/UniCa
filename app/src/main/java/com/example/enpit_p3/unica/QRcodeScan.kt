package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_qrcode_scan.*
import org.jetbrains.anko.startActivity

class QRcodeScan : AppCompatActivity() {

    override fun onCreate(saveInstanceState: Bundle?){
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_qrcode_scan)

        IntentIntegrator(this).initiateScan()

        finsh_scan.setOnClickListener {
            startActivity<HomeShop>()
        }
    }
}
