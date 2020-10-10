package com.masuwes.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.masuwes.academy.data.CourseEntity
import com.masuwes.academy.utils.DataDummy

class AcademyViewModel: ViewModel() {

    fun getCourse(): List<CourseEntity> = DataDummy.generateDummyCourses()
}