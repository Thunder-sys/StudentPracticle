package com.example.studentpracticle.khushi.khushi.khushi.id.id

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.studentpracticle.R

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
       var viewHolder:ViewHolder?

        if (convertView==null){
            var student= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=student.inflate(R.layout.id_viewlist,null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view = convertView
            viewHolder= view.tag as ViewHolder
        }
        var student_id = myitem[position]
        viewHolder.student_name?.text = student_id.Actorname
        viewHolder.student_father_name?.text = student_id.Actorfathername
        viewHolder.student_Roll_Number?.text = student_id.Actorrollnumber
        viewHolder.student_section?.text = student_id.Actorsection
        viewHolder.student_image?.setImageResource(student_id.Actorimage)
        return view as View
    }
    private class ViewHolder(row:View){
        var student_name = row.findViewById<TextView>(R.id.text1)
        var student_father_name = row.findViewById<TextView>(R.id.text2)
        var student_Roll_Number = row.findViewById<TextView>(R.id.text3)
        var student_section = row.findViewById<TextView>(R.id.text4)
        var student_image = row.findViewById<ImageView>(R.id.image1)
    }

}