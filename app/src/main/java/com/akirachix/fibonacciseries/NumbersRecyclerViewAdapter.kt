package com.akirachix.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViewAdapter(var numbers: List<Int>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_list_numbers,parent, false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumber.text= numbers[position].toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

}
class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}