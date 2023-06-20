package com.example.prakashmaharjan.recyclerviewdemokotlin

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

//import kotlinx.android.synthetic.main.row_layout.view.*

class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    private var listArray = listOf<String>(
        "Android 1.0",
        "Petit Four",
        "Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "Honeycomb",
        "Ice Cream Sandwich",
        "Jelly Bean",
        "Kitkat",
        "Lollipop",
        "Marshmallow",
        "Nougat",
        "Oreo",
        "Pie",
        "Quince Tart",
        "Red Velvet Cake",
        "Snow Cone",
        "Tiramisu",
        "Upside Down Cake",
        "Vanilla Ice Cream"
    )

    // number of items or rows
    override fun getItemCount(): Int {
        //return item count
        return listArray.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.row_layout, parent, false)
        return CustomViewHolder(cellForRow)
    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val title = listArray.get(position)
        //holder?.view.TitleTextViewID.text = title
        val titleTextV: TextView = holder.view.findViewById(R.id.TitleTextViewID)
        titleTextV.text = title
    }
}


class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}