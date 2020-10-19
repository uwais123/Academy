package com.masuwes.academy.ui.detail

import androidx.lifecycle.ViewModel
import com.masuwes.academy.data.CourseEntity
import com.masuwes.academy.data.ModuleEntity
import com.masuwes.academy.data.source.AcademyRepository
import com.masuwes.academy.utils.DataDummy

class DetailCourseViewModel(private val academyRepository: AcademyRepository): ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity = academyRepository.getCourseWithModules(courseId)

    fun getModules(): List<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)
}