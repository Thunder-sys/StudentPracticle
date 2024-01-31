package com.example.studentpracticle.kunal.kunal_advance_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.studentpracticle.R

class kunal_advance_list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal_advance_list)

        var kunallist = findViewById<ListView>(R.id.kunal_listview1)

        var kunallistdata = kunal_adapter(this,getkunaldata())
        kunallist.adapter=kunallistdata
    }

    private fun getkunaldata(): ArrayList<kunal_modelclass> {
        var kunaldatalist = ArrayList<kunal_modelclass>()
        var myact1 = kunal_modelclass("Akshya Kumar","Khiladi 786",R.drawable.akshay)
        var myact2 = kunal_modelclass("Ajay","Vimal pan masala dane dane me kesar ka dam",R.drawable.ajay)
        var myact3 = kunal_modelclass("Akshya Kumar","Khiladi 786",R.drawable.akshay)
        var myact4 = kunal_modelclass("Akshya Kumar","Khiladi 786",R.drawable.akshay)
        var myact5 = kunal_modelclass("Akshya Kumar","Khiladi 786",R.drawable.akshay)
        var myact6 = kunal_modelclass("Akshya Kumar","Khiladi 786",R.drawable.akshay)
        var myact7 = kunal_modelclass("Akshya Kumar","Khiladi 786",R.drawable.akshay)

        kunaldatalist.add(myact1)
        kunaldatalist.add(myact2)
        kunaldatalist.add(myact3)
        kunaldatalist.add(myact4)
        kunaldatalist.add(myact5)
        kunaldatalist.add(myact6)
        kunaldatalist.add(myact7)


        return kunaldatalist
    }
}