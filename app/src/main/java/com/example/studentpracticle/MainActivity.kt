package com.example.studentpracticle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import com.example.studentpracticle.khushi.Mylist
import com.example.studentpracticle.kunal.kunal
import com.example.studentpracticle.shakshi.MainActivity2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Declare List view
        var khu:Button=findViewById(R.id.sendtokhu)
        var shak:Button=findViewById(R.id.sendtoshak)
        var kuna:Button=findViewById(R.id.sendtokunal)

        khu.setOnClickListener(){
            var inte=Intent(this,Mylist::class.java)
            startActivity(inte)
        }
        shak.setOnClickListener(){
            var inte=Intent(this,MainActivity2::class.java)
            startActivity(inte)
        }
        kuna.setOnClickListener(){
            var inte=Intent(this,kunal::class.java)
            startActivity(inte)
        }

    }
}