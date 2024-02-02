package com.example.studentpracticle.Yash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.studentpracticle.R
import com.example.studentpracticle.khushi.Mylist
import com.example.studentpracticle.khushi.khushi.kadvance
import com.example.studentpracticle.kunal.Kunal
import com.example.studentpracticle.kunal.kunal_advance_list.kunal_advance_list
import com.example.studentpracticle.kunal.studentlist.kunal_student_advence_list
import com.example.studentpracticle.shakshi.MainActivity2
import com.example.studentpracticle.shakshi.advancelist.s_advancelist

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Declare List view
        var khu:Button=findViewById(R.id.sendtokhu)
        var shak:Button=findViewById(R.id.sendtoshak)
        var kuna:Button=findViewById(R.id.sendtokunal)
        var khu2:Button=findViewById(R.id.sendtokhu2)
        var shak2:Button=findViewById(R.id.sendtoshak2)
        var kuna2:Button=findViewById(R.id.sendtokunal2)
        var kuna3:Button=findViewById(R.id.sendtokunal3)

        khu.setOnClickListener(){
            var inte=Intent(this,Mylist::class.java)
            startActivity(inte)
        }
        shak.setOnClickListener(){
            var inte=Intent(this,MainActivity2::class.java)
            startActivity(inte)
        }
        kuna.setOnClickListener(){
            var inte=Intent(this,Kunal::class.java)
            startActivity(inte)
        }
        khu2.setOnClickListener(){
            var inte=Intent(this,kadvance::class.java)
            startActivity(inte)
        }
        shak2.setOnClickListener(){
            var inte=Intent(this,s_advancelist::class.java)
            startActivity(inte)
        }
        kuna2.setOnClickListener(){
            var inte=Intent(this,kunal_advance_list::class.java)
            startActivity(inte)
        }
        kuna3.setOnClickListener(){
            var inte=Intent(this,kunal_student_advence_list::class.java)
            startActivity(inte)
        }

    }
}