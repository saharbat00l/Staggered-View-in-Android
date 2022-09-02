package com.example.recyclerviewdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val itemList:List<Int>): RecyclerView.Adapter<Adapter.ViewHolder>() {



class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val imageView:ImageView=itemView.findViewById(R.id.imageView)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.imageView.setImageResource(itemList[position])
    }

    override fun getItemCount(): Int {
    return itemList.size
    }


}