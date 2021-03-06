package com.gehad.math_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ItemAdaptor (context: Context, data:ArrayList<ItemClass>): ArrayAdapter<ItemClass>(context,0,data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var itemView = convertView

        itemView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        val item = getItem(position)

        val title = itemView!!.findViewById<TextView>(R.id.year)
        title.text= item!!.title

        val desc = itemView!!.findViewById<TextView>(R.id.lesson)
        desc.text= item!!.desc

        val image =  itemView.findViewById<ImageView>(R.id.img_1)
        image.setImageResource(item.img)

        return itemView

    }
}