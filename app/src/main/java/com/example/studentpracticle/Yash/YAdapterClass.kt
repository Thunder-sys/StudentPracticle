package com.example.studentpracticle.Yash

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

class YAdapterClass(var acti:Activity,var myitem:ArrayList<YModelclass>):BaseAdapter() {
    override fun getCount(): Int {
        return myitem.size
    }

    override fun getItem(position: Int): Any {
        return myitem[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?):View {
        var view:View?
        var viewholder:ViewHolder?

        if (convertView==null){
            var mylay=acti?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=mylay.inflate(R.layout.myyasitemview,null)
            viewholder=ViewHolder(view)
            view?.tag=viewholder
        }else{
            view=convertView
            viewholder=view.tag as ViewHolder

        }
        var myviewitems=myitem[position]
        viewholder.myactorName.text=myviewitems.myactorName
        viewholder.myactormoview.text=myviewitems.myactormovie
        viewholder.myactorimage.setImageResource(myviewitems.myactor)


        return view as View
    }
    private class ViewHolder(row:View){
        var myactorName=row.findViewById<TextView>(R.id.yactorname)
        var myactormoview=row.findViewById<TextView>(R.id.yactormovie)
        var myactorimage=row.findViewById<ImageView>(R.id.imagdivya)
    }
}