package com.bca.muciter.adapter

import android.R.attr.thumbnail
import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bca.muciter.R
import com.bca.muciter.holder.MotorViewHolder
import com.bca.muciter.model.Motor
import org.jetbrains.anko.AnkoContext


class MotorAdapter (private val motors: List<Motor>, private val listener: (Motor) -> Unit)
    : RecyclerView.Adapter<MotorViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotorViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_motor, parent, false)
        return MotorViewHolder(itemView)
    }

    override fun getItemCount(): Int = motors.size

    override fun onBindViewHolder(holder: MotorViewHolder, position: Int) {
        holder.bindItem(motors[position], listener)
    }
}