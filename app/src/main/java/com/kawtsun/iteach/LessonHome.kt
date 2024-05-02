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

class LessonHome : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var mList = ArrayList<LessonData>()
    private lateinit var adapter: LessonAdapter
    var lessonDetails = ArrayList<String>()

    //Questions
    var question1 = ArrayList<String>()
    var question2 = ArrayList<String>()
    var question3 = ArrayList<String>()
    var question4 = ArrayList<String>()
    var question5 = ArrayList<String>()

    //Item No 1
    var question1button1 = ArrayList<String>()
    var question1button2 = ArrayList<String>()
    var question1button3 = ArrayList<String>()
    var question1button4 = ArrayList<String>()

    //Item No 2
    var question2button1 = ArrayList<String>()
    var question2button2 = ArrayList<String>()
    var question2button3 = ArrayList<String>()
    var question2button4 = ArrayList<String>()

    //Item No 3
    var question3button1 = ArrayList<String>()
    var question3button2 = ArrayList<String>()
    var question3button3 = ArrayList<String>()
    var question3button4 = ArrayList<String>()

    //Item No 4
    var question4button1 = ArrayList<String>()
    var question4button2 = ArrayList<String>()
    var question4button3 = ArrayList<String>()
    var question4button4 = ArrayList<String>()

    //Item No 5
    var question5button1 = ArrayList<String>()
    var question5button2 = ArrayList<String>()
    var question5button3 = ArrayList<String>()
    var question5button4 = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lessonDetails.add(getString(R.string.lessonAll1))
        lessonDetails.add(getString(R.string.lessonAll2))
        lessonDetails.add(getString(R.string.lessonAll3))
        lessonDetails.add(getString(R.string.lessonAll4))

        //Questions 1
        question1.add(getString(R.string.Lesson1Ques1))
        question1.add(getString(R.string.Lesson2Ques1))
        question1.add(getString(R.string.Lesson3Ques1))
        question1.add(getString(R.string.Lesson4Ques1))

        //Questions 2
        question2.add(getString(R.string.Lesson1Ques2))
        question2.add(getString(R.string.Lesson2Ques2))
        question2.add(getString(R.string.Lesson3Ques2))
        question2.add(getString(R.string.Lesson4Ques2))

        //Questions 3
        question3.add(getString(R.string.Lesson1Ques3))
        question3.add(getString(R.string.Lesson2Ques3))
        question3.add(getString(R.string.Lesson3Ques3))
        question3.add(getString(R.string.Lesson4Ques1))

        //Questions 4
        question4.add(getString(R.string.Lesson1Ques4))
        question4.add(getString(R.string.Lesson2Ques4))
        question4.add(getString(R.string.Lesson3Ques4))
        question4.add(getString(R.string.Lesson4Ques1))

        //Questions 5
        question5.add(getString(R.string.Lesson1Ques5))
        question5.add(getString(R.string.Lesson2Ques5))
        question5.add(getString(R.string.Lesson3Ques5))
        question5.add(getString(R.string.Lesson4Ques5))

        //Quiz Question 1 Button 1
        question1button1.add(getString(R.string.Lesson1Ques1_1))
        question1button1.add(getString(R.string.Lesson2Ques1_1))
        question1button1.add(getString(R.string.Lesson3Ques1_1))
        question1button1.add(getString(R.string.Lesson4Ques1_1))

        //Quiz Question 2  Button 1
        question2button1.add(getString(R.string.Lesson1Ques2_1))
        question2button1.add(getString(R.string.Lesson2Ques2_1))
        question2button1.add(getString(R.string.Lesson3Ques2_1))
        question2button1.add(getString(R.string.Lesson4Ques2_1))

        //Quiz Question 3  Button 1
        question3button1.add(getString(R.string.Lesson1Ques3_1))
        question3button1.add(getString(R.string.Lesson2Ques3_1))
        question3button1.add(getString(R.string.Lesson3Ques3_1))
        question3button1.add(getString(R.string.Lesson4Ques3_1))

        //Quiz Question 4  Button 1
        question4button1.add(getString(R.string.Lesson1Ques4_1))
        question4button1.add(getString(R.string.Lesson2Ques4_1))
        question4button1.add(getString(R.string.Lesson3Ques4_1))
        question4button1.add(getString(R.string.Lesson4Ques4_1))

        //Quiz Question 5  Button 1
        question5button1.add(getString(R.string.Lesson1Ques5_1))
        question5button1.add(getString(R.string.Lesson2Ques5_1))
        question5button1.add(getString(R.string.Lesson3Ques5_1))
        question5button1.add(getString(R.string.Lesson4Ques5_1))

        //Quiz Question 1  Button 2
        question1button2.add(getString(R.string.Lesson1Ques1_2))
        question1button2.add(getString(R.string.Lesson2Ques1_2))
        question1button2.add(getString(R.string.Lesson3Ques1_2))
        question1button2.add(getString(R.string.Lesson4Ques1_2))

        //Quiz Question 2  Button 2
        question2button2.add(getString(R.string.Lesson1Ques2_2))
        question2button2.add(getString(R.string.Lesson2Ques2_2))
        question2button2.add(getString(R.string.Lesson3Ques2_2))
        question2button2.add(getString(R.string.Lesson4Ques2_2))

        //Quiz Question 3  Button 2
        question3button2.add(getString(R.string.Lesson1Ques3_2))
        question3button2.add(getString(R.string.Lesson2Ques3_2))
        question3button2.add(getString(R.string.Lesson3Ques3_2))
        question3button2.add(getString(R.string.Lesson4Ques3_2))

        //Quiz Question 4  Button 2
        question4button2.add(getString(R.string.Lesson1Ques4_2))
        question4button2.add(getString(R.string.Lesson2Ques4_2))
        question4button2.add(getString(R.string.Lesson3Ques4_2))
        question4button2.add(getString(R.string.Lesson4Ques4_2))

        //Quiz Question 5  Button 2
        question5button2.add(getString(R.string.Lesson1Ques5_2))
        question5button2.add(getString(R.string.Lesson2Ques5_2))
        question5button2.add(getString(R.string.Lesson3Ques5_2))
        question5button2.add(getString(R.string.Lesson4Ques5_2))

        //Quiz Question 1  Button 3
        question1button3.add(getString(R.string.Lesson1Ques1_3))
        question1button3.add(getString(R.string.Lesson2Ques1_3))
        question1button3.add(getString(R.string.Lesson3Ques1_3))
        question1button3.add(getString(R.string.Lesson4Ques1_3))

        //Quiz Question 2  Button 3
        question2button3.add(getString(R.string.Lesson1Ques2_3))
        question2button3.add(getString(R.string.Lesson2Ques2_3))
        question2button3.add(getString(R.string.Lesson3Ques2_3))
        question2button3.add(getString(R.string.Lesson4Ques2_3))

        //Quiz Question 3  Button 3
        question3button3.add(getString(R.string.Lesson1Ques3_3))
        question3button3.add(getString(R.string.Lesson2Ques3_3))
        question3button3.add(getString(R.string.Lesson3Ques3_3))
        question3button3.add(getString(R.string.Lesson4Ques3_3))

        //Quiz Question 4  Button 3
        question4button3.add(getString(R.string.Lesson1Ques4_3))
        question4button3.add(getString(R.string.Lesson2Ques4_3))
        question4button3.add(getString(R.string.Lesson3Ques4_3))
        question4button3.add(getString(R.string.Lesson4Ques4_3))

        //Quiz Question 5  Button 3
        question5button3.add(getString(R.string.Lesson1Ques5_3))
        question5button3.add(getString(R.string.Lesson2Ques5_3))
        question5button3.add(getString(R.string.Lesson3Ques5_3))
        question5button3.add(getString(R.string.Lesson4Ques5_3))

        //Quiz Question 1  Button 4
        question1button4.add(getString(R.string.Lesson1Ques1_4))
        question1button4.add(getString(R.string.Lesson2Ques1_4))
        question1button4.add(getString(R.string.Lesson3Ques1_4))
        question1button4.add(getString(R.string.Lesson4Ques1_4))

        //Quiz Question 2  Button 4
        question2button4.add(getString(R.string.Lesson1Ques2_4))
        question2button4.add(getString(R.string.Lesson2Ques2_4))
        question2button4.add(getString(R.string.Lesson3Ques2_4))
        question2button4.add(getString(R.string.Lesson4Ques2_4))

        //Quiz Question 3  Button 4
        question3button4.add(getString(R.string.Lesson1Ques3_4))
        question3button4.add(getString(R.string.Lesson2Ques3_4))
        question3button4.add(getString(R.string.Lesson3Ques3_4))
        question3button4.add(getString(R.string.Lesson4Ques3_4))

        //Quiz Question 4  Button 4
        question4button4.add(getString(R.string.Lesson1Ques4_4))
        question4button4.add(getString(R.string.Lesson2Ques4_4))
        question4button4.add(getString(R.string.Lesson3Ques4_4))
        question4button4.add(getString(R.string.Lesson4Ques4_4))

        //Quiz Question 5  Button 4
        question5button4.add(getString(R.string.Lesson1Ques5_4))
        question5button4.add(getString(R.string.Lesson2Ques5_4))
        question5button4.add(getString(R.string.Lesson3Ques5_4))
        question5button4.add(getString(R.string.Lesson4Ques5_4))


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
                intent.putExtra("Question1", question1[position])
                intent.putExtra("Question2", question2[position])
                intent.putExtra("Question3", question3[position])
                intent.putExtra("Question4", question4[position])
                intent.putExtra("Question5", question5[position])

                intent.putExtra("1Choice1", question1button1[position])
                intent.putExtra("1Choice2", question1button2[position])
                intent.putExtra("1Choice3", question1button3[position])
                intent.putExtra("1Choice4", question1button4[position])

                intent.putExtra("2Choice1", question2button1[position])
                intent.putExtra("2Choice2", question2button2[position])
                intent.putExtra("2Choice3", question2button3[position])
                intent.putExtra("2Choice4", question2button4[position])

                intent.putExtra("3Choice1", question3button1[position])
                intent.putExtra("3Choice2", question3button2[position])
                intent.putExtra("3Choice3", question3button3[position])
                intent.putExtra("3Choice4", question3button4[position])

                intent.putExtra("4Choice1", question4button1[position])
                intent.putExtra("4Choice2", question4button2[position])
                intent.putExtra("4Choice3", question4button3[position])
                intent.putExtra("4Choice4", question4button4[position])

                intent.putExtra("5Choice1", question5button1[position])
                intent.putExtra("5Choice2", question5button2[position])
                intent.putExtra("5Choice3", question5button3[position])
                intent.putExtra("5Choice4", question5button4[position])
                startActivity(intent)
            }

        })
    }


    private fun addDataToList() {
        mList.add(LessonData(getString(R.string.lesson1), getString(R.string.LessonDes1)))
        mList.add(LessonData(getString(R.string.lesson2), getString(R.string.LessonDes2)))
        mList.add(LessonData(getString(R.string.lesson3), getString(R.string.LessonDes3)))
        mList.add(LessonData(getString(R.string.lesson4), getString(R.string.LessonDes4)))
    }

}
