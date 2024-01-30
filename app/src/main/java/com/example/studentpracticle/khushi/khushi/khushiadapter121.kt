package com.example.studentpracticle.khushi.khushi

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.LAYER_TYPE_HARDWARE
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.studentpracticle.R

class  khushiadapter121(var acti: Activity, var myitems:ArrayList< khushimodel>):BaseAdapter() {
    override fun getCount(): Int {
      return myitems.size
    }

    override fun getItem(position: Int): Any {
        return myitems[position]
    }

    override fun getItemId(position: Int): Long {
      return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView==null){
            var mylay= acti?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=mylay.inflate(R.layout.khushi,null)
            viewHolder=ViewHolder(view)
            view?.tag=viewHolder
        }else{
           view=convertView
            viewHolder=view.tag as ViewHolder
        }
        var myview=myitems[position]
        viewHolder.myactorname.text=myview.meactressname
        viewHolder.myactormovie.text=myview.meactormovei
        viewHolder.myactorimage.setImageResource(myview.meactor)
        return view as View

    }
    private class ViewHolder(row:View){
        var myactorname=row.findViewById<TextView>(R.id.kd1)
        var myactormovie=row.findViewById<TextView>(R.id.kd2)
        var myactorimage=row.findViewById<ImageView>(R.id.kd)
    }

}