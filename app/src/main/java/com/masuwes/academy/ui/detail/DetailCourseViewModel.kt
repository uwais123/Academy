package com.masuwes.academy.ui.detail

import androidx.lifecycle.ViewModel
import com.masuwes.academy.data.CourseEntity
import com.masuwes.academy.data.ModuleEntity
import com.masuwes.academy.utils.DataDummy

class DetailCourseViewModel: ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity {
        lateinit var course: CourseEntity
        val coursesEntities = DataDummy.generateDummyCourses()
        for (courseEntity in coursesEntities) {
            if (courseEntity.courseId == courseId) {
                course = courseEntity
            }
        }
        return course
    }

    fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}