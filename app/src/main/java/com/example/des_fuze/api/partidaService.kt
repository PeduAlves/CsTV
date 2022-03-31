package com.example.des_fuze.api

import com.example.des_fuze.api.model.partidaApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface partidaService {
    @GET("/matches?sort=&page=1&per_page=7&token=DRJxORnyDuFn_Hb49WF8YwM3zz0H5KX4wQdKSEWueK55WMVDnFM")
    fun listPartida(@Query("limit") limit: Int): Call<partidaApiResult>
}