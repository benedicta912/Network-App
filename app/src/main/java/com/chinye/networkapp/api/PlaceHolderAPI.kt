package com.chinye.networkapp.api

import com.chinye.networkapp.models.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderAPI {

    @GET("users")
    fun getUsers(): Call<List<User>>
}