package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_coupon_setting.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.yesButton

class CouponSetting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coupon_setting)

        //firebaseから取得
        val database = FirebaseDatabase.getInstance().getReference("coupon1")
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                val coupon1 = snapshot.value.toString()
                Coupon1.text = coupon1
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })




        val database2 = FirebaseDatabase.getInstance().getReference("coupon2")
        database2.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                var coupon2 = snapshot.value.toString()
                Coupon2.text = coupon2
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        val database3 = FirebaseDatabase.getInstance().getReference("coupon3")
        database3.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                var coupon3 = snapshot.value.toString()
                Coupon3.text = coupon3
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        val database4 = FirebaseDatabase.getInstance().getReference("pr")
        database4.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                var pr = snapshot.value.toString()
                PR.text = pr
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        val database5 = FirebaseDatabase.getInstance().getReference("shopname")
        database5.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                var shopname = snapshot.value.toString()
                shopName.text = shopname
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })


        //編集確定
        CouponSet.setOnClickListener {
            val coupon1 = newCoupon1.text.toString()
            val coupon2 = newCoupon2.text.toString()
            val coupon3 = newCoupon3.text.toString()
            val pr = newPR.text.toString()

            val key1 = "coupon1"
            val key2 = "coupon2"
            val key3 = "coupon3"
            val key4 = "pr"

            val database = FirebaseDatabase.getInstance()
            val ref1 = database.getReference(key1)
            val ref2 = database.getReference(key2)
            val ref3 = database.getReference(key3)
            val ref4 = database.getReference(key4)

            ref1.setValue(coupon1)
            ref2.setValue(coupon2)
            ref3.setValue(coupon3)
            ref4.setValue(pr)

            alert("変更しました") {
                yesButton { finish() }
            }.show()
        }

        back_CouponSetting.setOnClickListener {
            startActivity<HomeShop>()
        }

    }
}
