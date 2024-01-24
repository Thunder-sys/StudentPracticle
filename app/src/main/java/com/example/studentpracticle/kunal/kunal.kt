package com.example.studentpracticle.kunal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.studentpracticle.R

class kunal : AppCompatActivity() {

    lateinit var listview :ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal)


        listview = findViewById(R.id.kunal_listview)


        val array = arrayOf("Mon","Tue","Wed","Thur","Fri","Sat","Sun")

        val arrayAdapter:ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(
             this,
             android.R.layout.simple_list_item_1,
            array
        )
        listview.adapter = arrayAdapter
    }
}