package com.example.studentpracticle.shakshi.s_idcardlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.studentpracticle.R

class s_idmainactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sidmainactivity)
        var ilist=findViewById<ListView>(R.id.id_list)

        var idadap=s_id_adapterclass(this,getMyData())

        ilist.adapter=idadap


    }

    private fun getMyData(): ArrayList<s_id_modelclass> {
        var idlist=ArrayList<s_id_modelclass>()
        var id1=s_id_modelclass("Kriti","yash","A",R.drawable.kriti,"122")
        var id2=s_id_modelclass("Divya","yash","A",R.drawable.divya,"122")
        var id3=s_id_modelclass("Tanvi","yash","A",R.drawable.tanvi,"122")
        var id4=s_id_modelclass("Sidharath","yash","A",R.drawable.siddharth,"122")
        var id5=s_id_modelclass("Rao","yash","A",R.drawable.rao,"122")

        idlist.add(id1)
        idlist.add(id2)
        idlist.add(id3)
        idlist.add(id4)
        idlist.add(id5)

        return idlist

    }
}