package com.example.exmdemo1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.exmdemo1.R
import com.example.exmdemo1.model.ChannelItemModel
import com.example.exmdemo1.model.FindItemModel

class ChannelAdapter (private val data:List<ChannelItemModel>): RecyclerView.Adapter<ChannelAdapter.ViewHolder>() {

    private  lateinit var parent: ViewGroup

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var icon1: ImageView = itemView.findViewById(R.id.imageView)

        var heading: TextView = itemView.findViewById(R.id.textView2)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        this.parent=parent
        var inflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.channel,parent,false)

        return ChannelAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.icon1.setImageResource(item.image)
        holder.heading.text=item.head

    }
}