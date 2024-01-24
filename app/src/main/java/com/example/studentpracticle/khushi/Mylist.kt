package com.example.studentpracticle.khushi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.studentpracticle.R

class Mylist : AppCompatActivity() {
    lateinit var listView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mylist)
        var mylist= findViewById<ListView>(R.id.mylist)
        var mycitylist= arrayOf("AGRA","MATHURA","AYODHYA","VARANASI");
        var arrayAdapter:ArrayAdapter<*>
        arrayAdapter= ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            mycitylist
        )
        mylist.adapter=arrayAdapter
    }
}