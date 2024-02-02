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
        var id1=s_id_modelclass("Divya","mr.yash","A",R.drawable.divya,"122")

        idlist.add(id1)
        return idlist

    }
}