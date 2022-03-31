package com.example.des_fuze.api

import android.util.Log
import com.example.des_fuze.api.model.partidaApiResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object partidaRepository {
    private val service: partidaService

    init {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.pandascore.co/csgo")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            service = retrofit.create(partidaService::class.java)
    }

    fun getPartidas(limit: Int =10 ) {
        val  call = service.listPartida(limit)

        call.enqueue(object : Callback<partidaApiResult> {
            override fun onFailure(call: Call<partidaApiResult>, t: Throwable){
                Log.e("PARTIDA_API","Error loading partidas list.", t)
            }
            override fun onResponse(
                call: Call<partidaApiResult>,
                response: Response<partidaApiResult>
            ) {
                Log.d("PARTIDA_API","Partida list Loaded.")
            }

        })
    }
}