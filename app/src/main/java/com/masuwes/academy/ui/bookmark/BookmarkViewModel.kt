package com.masuwes.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.masuwes.academy.data.CourseEntity
import com.masuwes.academy.utils.DataDummy

class BookmarkViewModel: ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}