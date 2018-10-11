package com.bca.muciter.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bca.muciter.R
import com.bca.muciter.model.Motor
import com.bca.muciter.utils.toDecimalString
import com.squareup.picasso.Picasso
import org.jetbrains.anko.find
import org.jetbrains.anko.sdk25.coroutines.onClick

class MotorViewHolder(view: View): RecyclerView.ViewHolder(view){
    private val motorNameTextView: TextView = view.find(R.id.motorNameTextView)
    private val motorPriceTextView: TextView = view.find(R.id.motorPriceTextView)
    private val motorThumbnail: ImageView = view.find(R.id.thumbnailImageView)

    fun bindItem(motor: Motor, listener: (Motor) -> Unit){
        motorNameTextView.text = motor.motorName
        motorPriceTextView.text = "Rp. " +toDecimalString(motor.motorPrice)
        Picasso.get().load(motor.motorThumbnail).into(motorThumbnail)

        motorThumbnail.onClick {
            listener(motor)
        }
    }
}