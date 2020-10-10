package com.masuwes.academy.ui.bookmark

import com.masuwes.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
