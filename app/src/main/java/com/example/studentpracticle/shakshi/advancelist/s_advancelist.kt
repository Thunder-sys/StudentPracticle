package com.example.studentpracticle.shakshi.advancelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.studentpracticle.R
import com.example.studentpracticle.shakshi.s_adapterclass

class s_advancelist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sadvancelist)
        
        var s_listview=findViewById<ListView>(R.id.adlist)
         
        //create data
        
        var sadlist=s_adapterclass(this,getMyData())
        s_listview.adapter=sadlist
    }

    private fun getMyData(): ArrayList<sakshi_modelclass> {
        var datalist=ArrayList<sakshi_modelclass>()
        var actor1=sakshi_modelclass("akshay kumar","Entertainment",R.drawable.akshay)
        var actor2=sakshi_modelclass("akshay kumar","Entertainment",R.drawable.akshay)
        var actor3=sakshi_modelclass("akshay kumar","Entertainment",R.drawable.akshay)
        var actor4=sakshi_modelclass("akshay kumar","Entertainment",R.drawable.akshay)
        var actor5=sakshi_modelclass("akshay kumar","Entertainment",R.drawable.akshay)
        var actor6=sakshi_modelclass("akshay kumar","Entertainment",R.drawable.akshay)
        var actor7=sakshi_modelclass("akshay kumar","Entertainment",R.drawable.akshay)
        var actor8=sakshi_modelclass("akshay kumar","Entertainment",R.drawable.akshay)

         datalist.add(actor1)
         datalist.add(actor2)
         datalist.add(actor3)
         datalist.add(actor4)
         datalist.add(actor5)
         datalist.add(actor6)
         datalist.add(actor7)
         datalist.add(actor8)

        return datalist

    }
}