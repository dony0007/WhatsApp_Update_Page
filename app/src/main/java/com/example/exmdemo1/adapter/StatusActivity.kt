package com.example.exmdemo1.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.exmdemo1.R
import com.example.exmdemo1.model.SampleData

class StatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        var i = intent
        val pos = i.getIntExtra("statuspos",0)


        var img_rahul = findViewById<ImageView>(R.id.img_rahul)
        img_rahul.setImageResource(SampleData.statusDemo[pos].status)
    }
}