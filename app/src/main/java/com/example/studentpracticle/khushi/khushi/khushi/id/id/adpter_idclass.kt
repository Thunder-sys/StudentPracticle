package com.example.studentpracticle.khushi.khushi.khushi.id.id

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class adpter_idclass (var context: Activity, var myitem:ArrayList<id_modelclass> ):BaseAdapter(){
    override fun getCount(): Int {
        return myitem.size
    }

    override fun getItem(position: Int): Any {
       return myitem[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var view:View?
       var viewholder:ViewHolder?

    if }

}