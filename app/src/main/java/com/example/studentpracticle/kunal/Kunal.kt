package com.example.studentpracticle.kunal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.studentpracticle.R

class Kunal : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal)


        var listview:ListView = findViewById(R.id.kunal_listview)
        var mycitylist= arrayOf("Mon","Tue","Wed","Thur","Fri","Sat","Sun");
        var arrayAdapter:ArrayAdapter<*>
        arrayAdapter= ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            mycitylist
        )
        listview.adapter=arrayAdapter


    }
}