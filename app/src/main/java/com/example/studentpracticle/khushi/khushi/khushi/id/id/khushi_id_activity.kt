package com.example.studentpracticle.khushi.khushi.khushi.id.id

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.studentpracticle.R
import com.example.studentpracticle.kunal.studentlist.student_adapter
import com.example.studentpracticle.kunal.studentlist.student_id_modelclass

class khushi_id_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khushi_id)

        var list_data =adpter_idclass(this,getdata())
        var khus = findViewById<ListView>(R.id.raj)
        khus.adapter = list_data
    }

    private fun getdata(): ArrayList<adpter_idclass> {
        var student_datalist = ArrayList<adpter_idclass>()

        var student1 = id_modelclass("Akshya Kumar", "Hari Om Bhatia", "1", "A", R.drawable.akshay)
        var student2 = id_modelclass("Ajay", "Veeru Devgan", "2", "A", R.drawable.ajay)
        var student3 = id_modelclass("Divya", "Jitendra Deshmukh", "3", "B", R.drawable.divya)
        var student4 = id_modelclass("Haritik", "Rakesh Roshan", "4", "A", R.drawable.hritki)
        var student5 = id_modelclass("Kirati", "Rahul Sanon", "5", "B", R.drawable.kriti)
        var student6 = id_modelclass("Rao", " Late Shri G.Venkateswara Rao", "6", "A", R.drawable.rao)
        var student7 = id_modelclass("Siddharth", "Sunil Malhotra", "7", "A", R.drawable.siddharth)
        var student8 = id_modelclass("Tanvi", " Joga Sangha", "8", "B", R.drawable.tanvi)

        student_datalist.add(student1)
        student_datalist.add(student2)
        student_datalist.add(student3)
        student_datalist.add(student4)
        student_datalist.add(student5)
        student_datalist.add(student6)
        student_datalist.add(student7)
        student_datalist.add(student8)

        return student_datalist
    }
}
