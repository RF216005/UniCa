package com.example.enpit_p3.unica

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_message_list_show.*
import org.jetbrains.anko.startActivity

class MessageListShow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_list_show)
        setSupportActionBar(toolbar)

        val listView = findViewById(R.id.listView) as ListView
        val dataArray = arrayOf("title","edittitle")
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,dataArray)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val itemTextView:TextView = view.findViewById(android.R.id.text1)
            startActivity<HomeShop>()
        }
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
