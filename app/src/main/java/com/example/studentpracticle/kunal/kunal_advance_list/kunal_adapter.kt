package com.example.studentpracticle.kunal.kunal_advance_list

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

class kunal_adapter(var activity:Activity,var kunalitem:ArrayList<kunal_modelclass>):BaseAdapter() {
    override fun getCount(): Int {
        return kunalitem.size
    }

    override fun getItem(position: Int): Any {
        return kunalitem[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder?

        if (convertView==null){
            var kunal_layout = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=kunal_layout.inflate(R.layout.kunal_itemlist,null)
            viewHolder= ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view = convertView
            viewHolder=view.tag as ViewHolder
        }

        var kunalkaitem= kunalitem[position]
        viewHolder.actorname

    }
    private class ViewHolder(row:View){
        var actorname = row.findViewById<TextView>(R.id.kunal_imageName)
        var actorfilm = row.findViewById<TextView>(R.id.kunal_imagefilm)
        var actorimage = row.findViewById<ImageView>(R.id.kunal_image_itemlist)
    }
}