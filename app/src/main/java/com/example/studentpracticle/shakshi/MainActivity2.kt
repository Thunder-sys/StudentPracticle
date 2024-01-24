package com.example.studentpracticle.shakshi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.studentpracticle.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var list=findViewById<ListView>(R.id.mylist)
        var lists= arrayOf("Agra","Mathura", "Delhi","Ayodhya","Mumbai","Varanasi")
        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter= ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            lists
        )
        list.adapter=arrayAdapter
    }
}