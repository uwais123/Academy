package com.masuwes.academy.ui.academy

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class AcademyViewModelTest {

    private lateinit var viewModel: AcademyViewModel


    @Before
    fun setUp() {
        viewModel = AcademyViewModel()
    }

    // check apakah data sesuai dengan ekspektasi
    @Test
    fun getCourse() {
        val courseEntities = viewModel.getCourse()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities.size)
    }


}