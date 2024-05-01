package com.kawtsun.iteach

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.text.TextRunShaper
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LessonView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lesson_view)

        var number : Int = 1
        val score : TextView = findViewById(R.id.score)

        var questioncolor = Color.rgb(103, 80, 164)
        val headingLesson : TextView = findViewById(R.id.heading)
        val detailsLesson: TextView = findViewById(R.id.lessonInfo)

        val question1Lesson: TextView = findViewById(R.id.question1)
        val question2Lesson: TextView = findViewById(R.id.question2)
        val question3Lesson: TextView = findViewById(R.id.question3)
        val question4Lesson: TextView = findViewById(R.id.question4)
        val question5Lesson: TextView = findViewById(R.id.question5)

        val question1Button1: Button = findViewById(R.id.question1button1)
        val question1Button2: Button = findViewById(R.id.question1button2)
        val question1Button3: Button = findViewById(R.id.question1button3)
        val question1Button4: Button = findViewById(R.id.question1button4)

        val question2Button1: Button = findViewById(R.id.question2button1)
        val question2Button2: Button = findViewById(R.id.question2button2)
        val question2Button3: Button = findViewById(R.id.question2button3)
        val question2Button4: Button = findViewById(R.id.question2button4)

        val question3Button1: Button = findViewById(R.id.question3button1)
        val question3Button2: Button = findViewById(R.id.question3button2)
        val question3Button3: Button = findViewById(R.id.question3button3)
        val question3Button4: Button = findViewById(R.id.question3button4)

        val question4Button1: Button = findViewById(R.id.question4button1)
        val question4Button2: Button = findViewById(R.id.question4button2)
        val question4Button3: Button = findViewById(R.id.question4button3)
        val question4Button4: Button = findViewById(R.id.question4button4)

        val question5Button1: Button = findViewById(R.id.question5button1)
        val question5Button2: Button = findViewById(R.id.question5button2)
        val question5Button3: Button = findViewById(R.id.question5button3)
        val question5Button4: Button = findViewById(R.id.question5button4)

        //Incorrect answer buttons
        try{
            question1Button1.setOnClickListener {
                question1Button2.isEnabled = false;
                question1Button1.isEnabled = false;
                question1Button4.isEnabled = false;
                question1Button3.isEnabled = false;
                question1Button1.setBackgroundColor(questioncolor);
            }
            question1Button2.setOnClickListener {
                question1Button2.isEnabled = false;
                question1Button1.isEnabled = false;
                question1Button4.isEnabled = false;
                question1Button3.isEnabled = false;
                question1Button2.setBackgroundColor(questioncolor);
            }
            question1Button4.setOnClickListener {
                question1Button2.isEnabled = false;
                question1Button1.isEnabled = false;
                question1Button4.isEnabled = false;
                question1Button3.isEnabled = false;
                question1Button4.setBackgroundColor(questioncolor);
            }

            question2Button1.setOnClickListener {
                question2Button2.isEnabled = false;
                question2Button1.isEnabled = false;
                question2Button4.isEnabled = false;
                question2Button3.isEnabled = false;
                question2Button1.setBackgroundColor(questioncolor);
            }
            question2Button3.setOnClickListener {
                question2Button2.isEnabled = false;
                question2Button1.isEnabled = false;
                question2Button4.isEnabled = false;
                question2Button3.isEnabled = false;
                question2Button3.setBackgroundColor(questioncolor);
            }
            question2Button4.setOnClickListener {
                question2Button2.isEnabled = false;
                question2Button1.isEnabled = false;
                question2Button4.isEnabled = false;
                question2Button3.isEnabled = false;
                question2Button4.setBackgroundColor(questioncolor);
            }


            question3Button2.setOnClickListener {
                question3Button2.isEnabled = false;
                question3Button1.isEnabled = false;
                question3Button4.isEnabled = false;
                question3Button3.isEnabled = false;
                question3Button2.setBackgroundColor(questioncolor);
            }
            question3Button3.setOnClickListener {
                question3Button2.isEnabled = false;
                question3Button1.isEnabled = false;
                question3Button4.isEnabled = false;
                question3Button3.isEnabled = false;
                question3Button3.setBackgroundColor(questioncolor);
            }
            question3Button4.setOnClickListener {
                question3Button2.isEnabled = false;
                question3Button1.isEnabled = false;
                question3Button4.isEnabled = false;
                question3Button3.isEnabled = false;
                question3Button4.setBackgroundColor(questioncolor);
            }

            question4Button1.setOnClickListener {
                question4Button2.isEnabled = false;
                question4Button1.isEnabled = false;
                question4Button4.isEnabled = false;
                question4Button3.isEnabled = false;
                question4Button1.setBackgroundColor(questioncolor);
            }
            question4Button2.setOnClickListener {
                question4Button2.isEnabled = false;
                question4Button1.isEnabled = false;
                question4Button4.isEnabled = false;
                question4Button3.isEnabled = false;
                question4Button2.setBackgroundColor(questioncolor);
            }
            question4Button3.setOnClickListener {
                question4Button2.isEnabled = false;
                question4Button1.isEnabled = false;
                question4Button4.isEnabled = false;
                question4Button3.isEnabled = false;
                question4Button3.setBackgroundColor(questioncolor);
            }

            question5Button2.setOnClickListener {
                question5Button2.isEnabled = false;
                question5Button1.isEnabled = false;
                question5Button4.isEnabled = false;
                question5Button3.isEnabled = false;
                question5Button2.setBackgroundColor(questioncolor);
            }
            question5Button3.setOnClickListener {
                question5Button2.isEnabled = false;
                question5Button1.isEnabled = false;
                question5Button4.isEnabled = false;
                question5Button3.isEnabled = false;
                question5Button3.setBackgroundColor(questioncolor);
            }
            question5Button4.setOnClickListener {
                question5Button2.isEnabled = false;
                question5Button1.isEnabled = false;
                question5Button4.isEnabled = false;
                question5Button3.isEnabled = false;
                question5Button4.setBackgroundColor(questioncolor);
            }

        }catch (e: IllegalArgumentException){
            score.text = "0"
        }

        //Correct answer buttons
        try{
            question1Button3.setOnClickListener {
                question1Button2.isEnabled = false;
                question1Button1.isEnabled = false;
                question1Button4.isEnabled = false;
                question1Button3.isEnabled = false;
                question1Button3.setBackgroundColor(questioncolor);
                score.text = number++.toString()
            }
            question2Button2.setOnClickListener {
                question2Button2.isEnabled = false;
                question2Button1.isEnabled = false;
                question2Button4.isEnabled = false;
                question2Button3.isEnabled = false;
                question2Button2.setBackgroundColor(questioncolor);
                score.text = number++.toString()
            }
            question3Button1.setOnClickListener {
                question3Button2.isEnabled = false;
                question3Button1.isEnabled = false;
                question3Button4.isEnabled = false;
                question3Button3.isEnabled = false;
                question3Button1.setBackgroundColor(questioncolor);
                score.text = number++.toString()
            }
            question4Button4.setOnClickListener {
                question4Button2.isEnabled = false;
                question4Button1.isEnabled = false;
                question4Button4.isEnabled = false;
                question4Button3.isEnabled = false;
                question4Button4.setBackgroundColor(questioncolor);
                score.text = number++.toString()
            }
            question5Button1.setOnClickListener {
                question5Button2.isEnabled = false;
                question5Button1.isEnabled = false;
                question5Button4.isEnabled = false;
                question5Button3.isEnabled = false;
                question5Button1.setBackgroundColor(questioncolor);
                score.text = number++.toString()
            }
        }catch (e: IllegalArgumentException){
            score.text = "0"
        }

        val bundle: Bundle?= intent.extras
        val heading = bundle!!.getString("Heading")
        val details = bundle.getString("Details")

        val question1 = bundle.getString("Question1")
        val question2 = bundle.getString("Question2")
        val question3 = bundle.getString("Question3")
        val question4 = bundle.getString("Question4")
        val question5 = bundle.getString("Question5")

        val ques1button1 = bundle.getString("1Choice1")
        val ques1button2 = bundle.getString("1Choice2")
        val ques1button3 = bundle.getString("1Choice3")
        val ques1button4 = bundle.getString("1Choice4")

        val ques2button1 = bundle.getString("2Choice1")
        val ques2button2 = bundle.getString("2Choice2")
        val ques2button3 = bundle.getString("2Choice3")
        val ques2button4 = bundle.getString("2Choice4")

        val ques3button1 = bundle.getString("3Choice1")
        val ques3button2 = bundle.getString("3Choice2")
        val ques3button3 = bundle.getString("3Choice3")
        val ques3button4 = bundle.getString("3Choice4")

        val ques4button1 = bundle.getString("4Choice1")
        val ques4button2 = bundle.getString("4Choice2")
        val ques4button3 = bundle.getString("4Choice3")
        val ques4button4 = bundle.getString("4Choice4")

        val ques5button1 = bundle.getString("5Choice1")
        val ques5button2 = bundle.getString("5Choice2")
        val ques5button3 = bundle.getString("5Choice3")
        val ques5button4 = bundle.getString("5Choice4")

        headingLesson.text = heading
        detailsLesson.text = details

        question1Lesson.text = question1
        question2Lesson.text = question2
        question3Lesson.text = question3
        question4Lesson.text = question4
        question5Lesson.text = question5

        question1Button1.text = ques1button1
        question1Button2.text = ques1button2
        question1Button3.text = ques1button3
        question1Button4.text = ques1button4

        question2Button1.text = ques2button1
        question2Button2.text = ques2button2
        question2Button3.text = ques2button3
        question2Button4.text = ques2button4

        question3Button1.text = ques3button1
        question3Button2.text = ques3button2
        question3Button3.text = ques3button3
        question3Button4.text = ques3button4

        question4Button1.text = ques4button1
        question4Button2.text = ques4button2
        question4Button3.text = ques4button3
        question4Button4.text = ques4button4

        question5Button1.text = ques5button1
        question5Button2.text = ques5button2
        question5Button3.text = ques5button3
        question5Button4.text = ques5button4

    }

}