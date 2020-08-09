package com.example.prakashmaharjan.recyclerviewdemokotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_layout.view.*

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>(){

    var listArray =listOf<String>("Android 1.0", "Petit Four", "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "Kitkat", "Lollipop","Marshmallow", "Nougat", "Oreo", "Pie")

    // number of items or rows
    override fun getItemCount(): Int {
        //return  4
        return  listArray.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.row_layout, parent, false)
        return  CustomViewHolder(cellForRow)
    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

       // holder?.view.TitleTextViewID.text = "12345"

        val title = listArray.get(position)

        holder?.view.TitleTextViewID.text = title
    }
}


class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){

}