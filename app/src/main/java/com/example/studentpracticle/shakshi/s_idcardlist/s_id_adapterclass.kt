package com.example.studentpracticle.shakshi.s_idcardlist

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

class s_id_adapterclass(var acti : Activity, var s_id_item:ArrayList<s_id_modelclass>):BaseAdapter() {
    override fun getCount(): Int {
      return s_id_item.size
    }

    override fun getItem(position: Int): Any {
       return s_id_item[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder?


        if (convertView==null){
            var idlay=acti?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=idlay.inflate(R.layout.s_id_itemview,null)
            viewHolder=ViewHolder(view)
            view?.tag=viewHolder
        }else{
            view=convertView
            viewHolder=view.tag as ViewHolder
        }
        var iditem=s_id_item[position]
        viewHolder.idactname?.text=iditem.id_actname
        viewHolder.idactfather?.text=iditem.id_actfanamme
        viewHolder.idactroll?.text=iditem.id_actroll
        viewHolder.idactsec?.text=iditem.id_sec
        viewHolder.idactimag?.setImageResource(iditem.id_actimag)

        return view as View


    }

    private class ViewHolder(row:View){
        var idactname=row.findViewById<TextView>(R.id.name)
        var idactfather=row.findViewById<TextView>(R.id.sfather)
        var idactsec=row.findViewById<TextView>(R.id.section)
        var idactroll=row.findViewById<TextView>(R.id.roll)
        var idactimag=row.findViewById<ImageView>(R.id.imagkriti)
    }


}