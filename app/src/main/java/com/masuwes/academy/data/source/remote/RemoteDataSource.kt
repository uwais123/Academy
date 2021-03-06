package com.masuwes.academy.data.source.remote

import com.masuwes.academy.data.source.remote.response.ContentResponse
import com.masuwes.academy.data.source.remote.response.CourseResponse
import com.masuwes.academy.data.source.remote.response.ModuleResponse
import com.masuwes.academy.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

//    companion object {
//        @Volatile
//        private var instance: RemoteDataSource? = null
//
//        fun getInstance(helper: JsonHelper): RemoteDataSource =
//            instance ?: synchronized(this) {
//                instance ?: RemoteDataSource(helper)
//        }
//    }
//
//    fun getAllCourses(): List<CourseResponse> = jsonHelper.loadCourses()
//
//    fun getAllModules(courseId: String): List<ModuleResponse> = jsonHelper.loadModule(courseId)
//
//    fun getContent(moduleId: String): ContentResponse = jsonHelper.loadContent(moduleId)

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper)
            }
    }

    fun getAllCourses(): List<CourseResponse> = jsonHelper.loadCourses()

    fun getModules(courseId: String): List<ModuleResponse> = jsonHelper.loadModule(courseId)

    fun getContent(moduleId: String): ContentResponse = jsonHelper.loadContent(moduleId)
}