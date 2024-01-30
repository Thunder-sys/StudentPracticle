package com.example.studentpracticle.Yash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.studentpracticle.R

class MyAdvancedList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_advanced_list)

        //DECLARE THE LISTVIEW
        var mylistvi=findViewById<ListView>(R.id.myylist)

        //Create Data
        var mylisofdata=YAdapterClass(this,getMyData())

        mylistvi.adapter=mylisofdata
    }

    private fun getMyData(): ArrayList<YModelclass> {
        var mydatlist=ArrayList<YModelclass>()
        var myact1=YModelclass("Akshya Kumar","Khiladhi 786",R.drawable.akshay)
        var myact2=YModelclass("Akshya Kumar","Khiladhi 786",R.drawable.akshay)
        var myact3=YModelclass("Akshya Kumar","Khiladhi 786",R.drawable.akshay)
        var myact4=YModelclass("Akshya Kumar","Khiladhi 786",R.drawable.akshay)
        var myact5=YModelclass("Akshya Kumar","Khiladhi 786",R.drawable.akshay)
        var myact6=YModelclass("Akshya Kumar","Khiladhi 786",R.drawable.akshay)
        mydatlist.add(myact1)
        mydatlist.add(myact2)
        mydatlist.add(myact3)
        mydatlist.add(myact4)
        mydatlist.add(myact5)
        mydatlist.add(myact6)

        return mydatlist


    }
}