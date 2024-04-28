package com.kawtsun.iteach

import android.graphics.text.TextRunShaper
import android.os.Bundle
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

        val headingLesson : TextView = findViewById(R.id.heading)
        val detailsLesson: TextView = findViewById(R.id.lessonInfo)

        val bundle: Bundle?= intent.extras
        val heading = bundle!!.getString("Heading")
        val details = bundle.getString("Details")

        headingLesson.text = heading
        detailsLesson.text = details
    }
}