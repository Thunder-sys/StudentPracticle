package com.example.studentpracticle.khushi.khushi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.studentpracticle.R
import com.example.studentpracticle.kunal.kunal_advance_list.kunal_modelclass

class kadvance : AppCompatActivity() {
    private fun getMyData(): ArrayList<khushimodel> {
        var mydatlist = ArrayList<khushimodel>()
        var myact1 = khushimodel("Akshya Kumar", "Khiladi 786", R.drawable.akshay)
        var myact2 =
            khushimodel("Ajay", "Vimal pan masala dane dane me kesar ka dam", R.drawable.ajay)
        var myact3 = khushimodel("Divya", "Deewana", R.drawable.divya)
        var myact4 = khushimodel("Haritki", "Heart Attack", R.drawable.hritki)
        var myact5 = khushimodel("Kirati", "Snug Fu", R.drawable.kriti)
        var myact6 = khushimodel("Rao", "Badhaai Do", R.drawable.rao)
        var myact7 = khushimodel("Sidaharth", "Oy", R.drawable.siddharth)
        mydatlist.add(myact1)
        mydatlist.add(myact2)
        mydatlist.add(myact3)
         mydatlist.add(myact4)
        mydatlist.add(myact5)
        mydatlist.add(myact6)
        mydatlist.add(myact7)
        return mydatlist
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kadvance)

        var mylistvi = findViewById<ListView>(R.id.listmyt)
        var mylistof = khushiadapter121(this, getMyData())
        mylistvi.adapter = mylistof

    }
}































