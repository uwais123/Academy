package com.masuwes.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.masuwes.academy.data.CourseEntity
import com.masuwes.academy.data.source.AcademyRepository
import com.masuwes.academy.utils.DataDummy

class AcademyViewModel(private val academyRepository: AcademyRepository): ViewModel() {

    fun getCourse(): List<CourseEntity> = academyRepository.getAllCourses()
}