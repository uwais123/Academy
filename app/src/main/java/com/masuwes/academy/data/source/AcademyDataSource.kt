package com.masuwes.academy.data.source

import com.masuwes.academy.data.CourseEntity
import com.masuwes.academy.data.ModuleEntity
import com.masuwes.academy.data.source.remote.response.CourseResponse

interface AcademyDataSource {

    fun getAllCourses(): List<CourseEntity>

    fun getBookmarkedCourses(): List<CourseEntity>

    fun getCourseWithModules(courseId: String): CourseEntity

    fun getAllModulesByCourse(courseId: String): List<ModuleEntity>

    fun getContent(courseId: String, moduleId: String): ModuleEntity
}