package com.example.studentpracticle.khushi.khushi.khushi.id.id

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
        var view: View?
        var viewholder: ViewHolder?

        if (convertView == null) {
            val myinflator =
                context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = myinflator.inflate(R.layout.activity_khushi_id, null)
            viewholder = ViewHolder(view)
            view?.tag = viewholder
        } else {
            view = convertView
            viewholder = view.tag as ViewHolder
        }
        var student_id = myitem[position]
        viewholder.Actorname.text = student_id.Actorname
        viewholder.Actorfathername.text = student_id.Actorfathername
        viewholder.Actorsection.text = student_id.Actorsection
        viewholder.Actorollnumber.text = student_id.Actorrollnumber
        viewholder.Actorimage.setImageResource(student_id.Actorimage)
        return view as View
    }
    private class ViewHolder(row:View){
        var Actorname=row.findViewById<TextView>(R.id.text1)
        var Actorfathername=row.findViewById<TextView>(R.id.text2)
        var Actorollnumber=row.findViewById<TextView>(R.id.text3)
        var Actorsection=row.findViewById<TextView>(R.id.text1)
        var Actorimage=row.findViewById<ImageView>(R.id.image1)
    }

}