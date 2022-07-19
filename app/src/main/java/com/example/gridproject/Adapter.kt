package com.example.gridproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.NameList

class Adapter(): BaseAdapter() {
    var namelist = ArrayList<Model>()
    var context : Context? = null

    constructor(nameList: ArrayList<Model>,context: Context?) : this() {
        this.namelist = namelist
        this.context = context
    }
    override fun getCount(): Int {

        return namelist.size
    }

    override fun getItem(p0: Int): Any? {

        return null
    }

    override fun getItemId(p0: Int): Long {

        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val name = this.namelist[p0]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var nameView = inflator.inflate(R.layout.item,null)
        var txt = nameView.findViewById<TextView>(R.id.txt)
        txt.text = name.toString()
        return nameView


    }
}