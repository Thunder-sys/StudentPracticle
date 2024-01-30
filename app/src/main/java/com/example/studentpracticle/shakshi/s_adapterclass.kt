package com.example.studentpracticle.shakshi

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.studentpracticle.R
import com.example.studentpracticle.shakshi.advancelist.sakshi_modelclass

class s_adapterclass(var activity:Activity,var sitem:ArrayList<sakshi_modelclass>):BaseAdapter(){
    override fun getCount(): Int {
        return sitem.size
    }

    override fun getItem(position: Int): Any {
        return sitem[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder?

        if (convertView==null) {
            var mylay = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=mylay.inflate(R.layout.s_itemview,null)
            viewHolder=ViewHolder(view)
            view?.tag=viewHolder

        } else {
            view=convertView
            viewHolder=view.tag as ViewHolder
        }


    }
    private class ViewHolder(row:View){
        var myactorname=row.findViewById<TextView>(R.id.divya)
        var myactormovie=row.findViewById<TextView>(R.id.janedo)
        var myactorima=row.findViewById<ImageView>(R.id.imagdivya)

    }
}
