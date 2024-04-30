package com.kawtsun.iteach

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ResultAdapter(private var mList2: List<ResultData>) :
    RecyclerView.Adapter<ResultAdapter.ResultViewHolder>() {

    inner class ResultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle2: TextView = itemView.findViewById(R.id.tvTitle2)
        val tvDescription2: TextView = itemView.findViewById(R.id.tvDescription2)
        val lessonDesc2: TextView = itemView.findViewById(R.id.lessonDescription2)
        val constraintLayout2: ConstraintLayout = itemView.findViewById(R.id.constraintLayout2)

        fun collapseExpandedView () {
            lessonDesc2.visibility = View.GONE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_result, parent, false)
        return ResultViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList2.size
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        val resultData = mList2[position]
        holder.tvTitle2.text = resultData.title2
        holder.tvDescription2.text = resultData.titleDescription2
        holder.lessonDesc2.text = resultData.lessonDescription2

        val isExpandable: Boolean = resultData.isExpandable
        holder.lessonDesc2.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.constraintLayout2.setOnClickListener {
            isAnyItemExpanded(position)
            resultData.isExpandable = !resultData.isExpandable
            notifyItemChanged(position, Unit)
        }
    }

    private fun isAnyItemExpanded(position: Int) {
        val temp = mList2.indexOfFirst {
            it.isExpandable
        }

        if (temp >= 0 && temp != position) {
            mList2[temp].isExpandable = false
            notifyItemChanged(temp, 0)
        }
    }
    override fun onBindViewHolder(
        holder: ResultViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        if(payloads.isNotEmpty() && payloads[0] == 0) {
            holder.collapseExpandedView()
        } else {
            super.onBindViewHolder(holder, position, payloads)
        }

    }

}