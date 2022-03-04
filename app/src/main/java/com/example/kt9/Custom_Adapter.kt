package com.example.kt9

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Custom_Adapter() : RecyclerView.Adapter<Custom_Adapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
     var myViewInflater = LayoutInflater.from(viewGroup.context).inflate(R.layout.custom_layout,viewGroup,false)
        return ViewHolder(myViewInflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 9

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}