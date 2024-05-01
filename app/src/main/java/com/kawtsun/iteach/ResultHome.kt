package com.kawtsun.iteach

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ResultHome : Fragment() {

    private lateinit var recyclerView2: RecyclerView
    private var mList2 = ArrayList<ResultData>()
    private lateinit var adapter2: ResultAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView2 = view.findViewById(R.id.recyclerView2)
        val layoutManager2 = LinearLayoutManager(context)

        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager = layoutManager2

        addDataToList2()
        adapter2 = ResultAdapter(mList2)
        recyclerView2.adapter = adapter2
    }


    private fun addDataToList2() {
        mList2.add(ResultData(getString(R.string.quiz1), getString(R.string.click), getString(R.string.lorem2)))
        mList2.add(ResultData(getString(R.string.quiz1), getString(R.string.click),getString(R.string.lorem2)))
        mList2.add(ResultData(getString(R.string.quiz1), getString(R.string.click),getString(R.string.lorem2)))
        mList2.add(ResultData(getString(R.string.quiz1), getString(R.string.click),getString(R.string.lorem2)))
    }

}