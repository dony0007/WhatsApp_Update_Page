package com.example.exmdemo1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.exmdemo1.R
import com.example.exmdemo1.model.FindItemModel

class FindAdapter(private val data:List<FindItemModel>): RecyclerView.Adapter<FindAdapter.ViewHolder>() {
    private lateinit var parent: ViewGroup

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var icon: ImageView = itemView.findViewById(R.id.imageView3)
        var post: ImageView = itemView.findViewById(R.id.imageView4)
        var textfind:TextView = itemView.findViewById(R.id.textView6)






    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.parent = parent
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.find_item,parent,false)
        return FindAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.icon.setImageResource(item.icon)
        holder.post.setImageResource(item.post)
        holder.textfind.text = item.textfind

    }
}