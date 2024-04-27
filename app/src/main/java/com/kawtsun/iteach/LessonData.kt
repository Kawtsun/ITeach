package com.kawtsun.iteach

data class LessonData(
    val title: String,
    val titleDescription: String,
    val lessonDescription: String,
    var isExpandable: Boolean = false
)
