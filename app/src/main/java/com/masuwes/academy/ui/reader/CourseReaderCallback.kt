package com.masuwes.academy.ui.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}