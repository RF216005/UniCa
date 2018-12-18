package com.example.enpit_p3.unica


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_message_make.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.yesButton


class MessageMake : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_make)

        val count:Int
        count = 0
        button4.setOnClickListener {
            val countscore: Int
            countscore = count + 1
            if (countscore == 1) {
                val title = edittitle.text.toString()
                val detail = editText3.text.toString()

                val key1 = "title"
                val key2 = "detail"

                val database = FirebaseDatabase.getInstance()
                val ref1 = database.getReference(key1)
                val ref2 = database.getReference(key2)

                ref1.setValue(title)
                ref2.setValue(detail)

                alert("投稿しました") {
                    yesButton { finish() }
                }.show()
            }
            if (countscore == 2) {
                val title2 = edittitle.text.toString()
                val detail2 = editText3.text.toString()

                val key1 = "title2"
                val key2 = "detail2"

                val database = FirebaseDatabase.getInstance()
                val ref1 = database.getReference(key1)
                val ref2 = database.getReference(key2)

                ref1.setValue(title2)
                ref2.setValue(detail2)

                alert("投稿しました") {
                    yesButton { finish() }
                }.show()
            }
            if (countscore == 3) {

                val title3 = edittitle.text.toString()
                val detail3 = editText3.text.toString()

                val key1 = "title3"
                val key2 = "detail3"

                val database = FirebaseDatabase.getInstance()
                val ref1 = database.getReference(key1)
                val ref2 = database.getReference(key2)

                ref1.setValue(title3)
                ref2.setValue(detail3)

                alert("投稿しました") {
                    yesButton { finish() }
                }.show()
                countscore == 0
            }
        }
        back_1.setOnClickListener {
            startActivity<MessageList>()
        }
    }
}