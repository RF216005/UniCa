package com.example.enpit_p3.unica


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_message_make.*
import org.jetbrains.anko.startActivity


class MessageMake : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_make)


        button4.setOnClickListener {
            val title = edittitle.text.toString()
            val detail = editText3.text.toString()

            val key1 = "title"
            val key2 = "detail"

            val database = FirebaseDatabase.getInstance()
            val ref1 = database.getReference(key1)
            val ref2 = database.getReference(key2)

            ref1.setValue(title)
            ref2.setValue(detail)

        }

        back_1.setOnClickListener {
            startActivity<MessageList>()
        }
    }
}