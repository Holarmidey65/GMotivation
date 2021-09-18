package com.showtyclef.gmotivation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.showtyclef.gmotivation.R
import com.showtyclef.gmotivation.presentation.Quotes

class QuoteAdapter(private val context: Context, private val dataSet : List<Quotes>) :
    RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder>() {
        class QuoteViewHolder(view: View) : RecyclerView.ViewHolder(view){
            val picture: ImageView = view.findViewById(R.id.image)
            val motivate: TextView = view.findViewById(R.id.quote)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_quotes, parent, false)
            return QuoteViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        val motivation = dataSet[position]
        holder.picture.setImageResource(motivation.imageResourceId)
        holder.motivate.text = context.resources.getString(motivation.stringResourceId)
    }

    override fun getItemCount() = dataSet.size
}
