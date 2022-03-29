package com.example.des_fuze.domain

data class partidasCard(
    val imageUrlTime_1: String,
    val imageUrlTime_2: String,
    val imageUrlLiga: String,
    // Nomes de Time devem conter até no maximo 15 caracteres
    val nameTime_1: String,
    val nameTime_2: String,
    val nameLiga: String,
    val nameSerie: String,
    val diaPartida: String,
    val horaPartida: String,
)