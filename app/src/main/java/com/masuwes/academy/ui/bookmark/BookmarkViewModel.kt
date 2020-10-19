package com.masuwes.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.masuwes.academy.data.CourseEntity
import com.masuwes.academy.data.source.AcademyRepository
import com.masuwes.academy.utils.DataDummy

class BookmarkViewModel(private val academyRepository: AcademyRepository): ViewModel() {

    fun getBookmarks(): List<CourseEntity> = academyRepository.getBookmarkedCourses()
}