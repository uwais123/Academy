package com.masuwes.di

import android.content.Context
import com.masuwes.academy.data.source.AcademyRepository
import com.masuwes.academy.data.source.remote.RemoteDataSource
import com.masuwes.academy.utils.JsonHelper

object Injection {
    fun providerRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}