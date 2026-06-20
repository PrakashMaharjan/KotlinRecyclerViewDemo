package com.example.prakashmaharjan.recyclerviewdemokotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prakashmaharjan.recyclerviewdemokotlin.databinding.RowLayoutBinding

class MainAdapter : RecyclerView.Adapter<MainAdapter.CustomViewHolder>() {

    private val listArray = listOf(
        "Android 1.0", "Petit Four", "Cupcake", "Donut", "Eclair", "Froyo",
        "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean",
        "Kitkat", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie",
        "Quince Tart", "Red Velvet Cake", "Snow Cone", "Tiramisu",
        "Upside Down Cake", "Vanilla Ice Cream", "Baklava"
    )

    override fun getItemCount(): Int = listArray.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val title = listArray[position]
        holder.binding.TitleTextViewID.text = title
    }

    class CustomViewHolder(val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)
}
