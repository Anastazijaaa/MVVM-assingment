package com.anastazijazivkovic.mvvvm.data.api

import com.anastazijazivkovic.mvvvm.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}