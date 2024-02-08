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
        var khus = findViewById<ListView>(R.id.raj)
        var list_data =adpter_idclass(this,getdataList1())

        khus.adapter = list_data
    }

    private fun getdataList1(): ArrayList<id_modelclass> {
        var student_datalist = ArrayList<id_modelclass>()

        var student1 = id_modelclass("Name : Akshya Kumar", "Father name : Hari Om Bhatia", "Roll no. : 1", "Section : A", R.drawable.akshay)
        var student2 = id_modelclass("Name : Ajay", "Father name : Veeru Devgan", "Roll no. : 2", "Section : A", R.drawable.ajay)
        var student3 = id_modelclass("Name : Divya", "Father name : Jitendra Deshmukh", "Roll no. : 3", "Section : B", R.drawable.divya)
        var student4 = id_modelclass("Name : Haritik", "Father name : Rakesh Roshan", "Roll no. : 4", "Section : A", R.drawable.hritki)
        var student5 = id_modelclass("Name : Kirati", "Father name : Rahul Sanon", "Roll no. : 5", "Section : B", R.drawable.kriti)
        var student6 = id_modelclass("Name : Rao", "Father name : Late Shri G.Venkateswara Rao", "Roll no. : 6", "Section : A", R.drawable.rao)
        var student7 = id_modelclass("Name : Siddharth", "Father name : Sunil Malhotra", "Roll no. : 7", "Section : A", R.drawable.siddharth)
        var student8 = id_modelclass("Name : Tanvi", "Father name : Joga Sangha", "Roll no. : 8", "Section : B", R.drawable.tanvi)

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
