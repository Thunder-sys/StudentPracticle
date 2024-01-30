package com.example.studentpracticle.khushi.khushi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.studentpracticle.R

class kadvance : AppCompatActivity() {
    private fun getMyData(): ArrayList<khushimodel>{
        var mydatlist=ArrayList<khushimodel>()
        var myact2=khushimodel("Akshya kumar","khiladhi 786",R.drawable.akshay)
        var myact3=khushimodel("Akshya kumar","khiladhi 786",R.drawable.akshay)
        var myact4=khushimodel("Akshya kumar","khiladhi 786",R.drawable.akshay)
        var myact5=khushimodel("Akshya kumar","khiladhi 786",R.drawable.akshay)
        var myact6=khushimodel("Akshya kumar","khiladhi 786",R.drawable.akshay)
        var myact7=khushimodel("Akshya kumar","khiladhi 786",R.drawable.akshay)
        var myact8=khushimodel("Akshya kumar","khiladhi 786",R.drawable.akshay)
        mydatlist.add(myact2)
        mydatlist.add(myact3)
        mydatlist.add(myact4)
        mydatlist.add(myact5)
        mydatlist.add(myact6)
        mydatlist.add(myact7)
        mydatlist.add(myact8)
        return mydatlist
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadvance)
        
        var mylistvi=findViewById<ListView>(R.id.listmyt)
        var mylistof=khushiadapter121(this,getMyData())
        mylistvi.adapter=mylistof

    }
}