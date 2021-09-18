package com.showtyclef.gmotivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.showtyclef.gmotivation.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataSet = DataSource().loadQuotes()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = com.showtyclef.gmotivation.adapter.QuoteAdapter(this, myDataSet)
        recyclerView.setHasFixedSize(true)
    }
}