package com.example.studentpracticle.kunal.studentlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.studentpracticle.R
import com.example.studentpracticle.kunal.kunal_advance_list.kunal_adapter
import com.example.studentpracticle.kunal.kunal_advance_list.kunal_modelclass

class kunal_student_advence_list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal_student_advence_list)
        var kunal_student_list = findViewById<ListView>(R.id.kunal_student_list)

        var list_data = student_adapter(this,getdatalist())
        kunal_student_list.adapter = list_data
    }
    private fun getdatalist():ArrayList<student_id_modelclass>{
        var student_datalist = ArrayList<student_id_modelclass>()

        var student1 =  student_id_modelclass("Akshya Kumar","Hari Om Bhatia","1","A",R.drawable.akshay)
        var student2 =  student_id_modelclass("Ajay","Veeru Devgan","2","A", R.drawable.ajay)
        var student3 =  student_id_modelclass("Divya","Jitendra Deshmukh","3","B", R.drawable.divya)
        var student4 =  student_id_modelclass("Haritik","Rakesh Roshan","4","A", R.drawable.hritki)
        var student5 =  student_id_modelclass("Kirati","Rahul Sanon","5","B", R.drawable.kriti)
        var student6 =  student_id_modelclass("Rao"," Late Shri G.Venkateswara Rao","6","A", R.drawable.rao)
        var student7 =  student_id_modelclass("Siddharth","Sunil Malhotra","7","A", R.drawable.siddharth)
        var student8 =  student_id_modelclass("Tanvi"," Joga Sangha","8","B", R.drawable.tanvi)

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