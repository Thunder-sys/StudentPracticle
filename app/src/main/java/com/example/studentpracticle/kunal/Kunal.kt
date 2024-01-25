package com.example.studentpracticle.kunal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.example.studentpracticle.R

class Kunal : AppCompatActivity() {
     private lateinit var listview:ListView
     private lateinit var top3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal)

        top3 = findViewById(R.id.top3)


        listview = findViewById(R.id.kunal_listview)


        val array= arrayOf("Mon","Tue","Wed","Thur","Fri","Sat","Sun")
        val arrayAdapter:ArrayAdapter<*>
        arrayAdapter= ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            array
        )
        listview.adapter=arrayAdapter
        top3.setOnClickListener(){
            val array3 = arrayOf("Mon","Tue","Wed")
            val arrayAdapter3:ArrayAdapter<*>
            arrayAdapter3= ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                array3
            )
            listview.adapter=arrayAdapter3
        }
    }
}