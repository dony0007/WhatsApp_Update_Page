package com.example.exmdemo1.adapter



import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exmdemo1.R
import com.example.exmdemo1.MainActivity
import com.example.exmdemo1.model.StatusItemModel

class StatusAdapter(private val data: List<StatusItemModel>): RecyclerView.Adapter<StatusAdapter.ViewHolder>() {

    private lateinit var parent: ViewGroup

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var profile: ImageView = itemView.findViewById(R.id.imgStatus)
        var text2: TextView = itemView.findViewById(R.id.textView16)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.parent = parent
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.status_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.profile.setImageResource(item.image)
        holder.text2.text = item.textstatus
        holder.profile.setOnClickListener {
            val i = Intent(holder.profile.context,StatusActivity::class.java)
            i.putExtra("statusPos",position)
            holder.profile.context.startActivity(i)
        }
    }
}



