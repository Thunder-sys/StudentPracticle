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
            R.layout.sakshitextview,
            R.id.textView,
            lists
        )
        list.adapter=arrayAdapter
    }
}