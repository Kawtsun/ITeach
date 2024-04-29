package com.kawtsun.iteach

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LessonHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class LessonHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    private lateinit var recyclerView: RecyclerView
    private var mList = ArrayList<LessonData>()
    private lateinit var adapter: LessonAdapter
    var lessonDetails = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson_home, container, false)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LessonHome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LessonHome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lessonDetails.add(getString(R.string.loremlong))
        lessonDetails.add(getString(R.string.loremlong))
        lessonDetails.add(getString(R.string.loremlong))
        lessonDetails.add(getString(R.string.loremlong))


        recyclerView = view.findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(context)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager

        addDataToList()
        val adapter = LessonAdapter(mList)
        recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : LessonAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                //Toast.makeText(requireActivity(),"You Clicked om Item no. $position", Toast.LENGTH_LONG).show()

                val intent = Intent(requireActivity(),LessonView::class.java)
                intent.putExtra("Heading", mList[position].title)
                intent.putExtra("Details", lessonDetails[position])
                startActivity(intent)
            }

        })
    }


    private fun addDataToList() {
        mList.add(LessonData(getString(R.string.lesson1), getString(R.string.lorem)))
        mList.add(LessonData(getString(R.string.lesson2), getString(R.string.lorem)))
        mList.add(LessonData(getString(R.string.lesson3), getString(R.string.lorem)))
        mList.add(LessonData(getString(R.string.lesson4), getString(R.string.lorem)))
    }

}