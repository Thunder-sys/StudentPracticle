package com.example.studentpracticle.kunal.studentlist

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

class student_adapter(var studentactivity:Activity,var kunal_student_item:ArrayList<student_id_modelclass>):BaseAdapter() {
    override fun getCount(): Int {
        return kunal_student_item.size
    }

    override fun getItem(position: Int): Any {
        return kunal_student_item[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder?


        if (convertView==null){
            var student= studentactivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=student.inflate(R.layout.kunal_school_idcard,null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view = convertView
            viewHolder= view.tag as ViewHolder
        }
        var student_id = kunal_student_item[position]
        viewHolder.student_name.text = student_id.student_name
        viewHolder.student_father_name.text = student_id.student_fathername
        viewHolder.student_Roll_Number.text = student_id.student_rollnumber
        viewHolder.student_section.text = student_id.student_section
        viewHolder.student_image.setImageResource(student_id.student_image)
        return view as View
    }
    private class ViewHolder(row:View){
        var student_name = row.findViewById<TextView>(R.id.kunal_student_name)
        var student_father_name = row.findViewById<TextView>(R.id.kunal_student_fathername)
        var student_Roll_Number = row.findViewById<TextView>(R.id.kunal_student_rollnumber)
        var student_section = row.findViewById<TextView>(R.id.kunal_student_section)
        var student_image = row.findViewById<ImageView>(R.id.kunal_student_image)
    }
}