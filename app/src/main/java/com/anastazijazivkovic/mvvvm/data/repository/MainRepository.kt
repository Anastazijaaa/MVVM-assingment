package com.anastazijazivkovic.mvvvm.data.repository

import com.anastazijazivkovic.mvvvm.data.api.ApiHelper
import com.anastazijazivkovic.mvvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}