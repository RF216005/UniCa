@file:Suppress("UNREACHABLE_CODE")

package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_message_list.*
import org.jetbrains.anko.startActivity


class MessageList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_list)
        
        val database = FirebaseDatabase.getInstance().getReference("title")
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                val title = snapshot.value.toString()
                textView12.text = title
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        val database2 = FirebaseDatabase.getInstance().getReference("detail")
        database2.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                val detail = snapshot.value.toString()
                textView14.text = detail
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })


            ReloadButton.setOnClickListener {
                val database = FirebaseDatabase.getInstance().getReference("title")
                database.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {

                        val title = snapshot.value.toString()
                        textView12.text = title
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }
                })
            }




        back_2.setOnClickListener {
            startActivity<HomeShop>()
        }

        new01.setOnClickListener {
            startActivity<MessageMake>()

        }
    }
}

