package com.example.billy.firstappkotlin.kotlinforandroidDeveloper.recycleAdapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class RecycleAdapter(val items: List<String>) : RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = items[position]
    }


    class ViewHolder(val name: TextView) : RecyclerView.ViewHolder(name)
}