package com.example.myapplicationgibranapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WelcomeAdapter(private val titles: Array<String>, private val descriptions: Array<String>) :
    RecyclerView.Adapter<WelcomeAdapter.WelcomeViewHolder>() {

    class WelcomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        val tvDescription: TextView = view.findViewById(R.id.tvDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WelcomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_welcome, parent, false)
        return WelcomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: WelcomeViewHolder, position: Int) {
        holder.tvTitle.text = titles[position]
        holder.tvDescription.text = descriptions[position]
    }

    override fun getItemCount(): Int = titles.size
}