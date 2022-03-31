package com.example.des_fuze.api.model

import java.util.*

data class partidaApiResult (
    val serie: List<RSerie>,
    val result: List<RResult>,
    val tournament: List<Rtournament>,
    val winner: List<Rwinner>,
    val game: List<Rgame>,
    val league: List<Rleague>,
    val live: List<Rlive>,
    val streamslist: List<Rstreamslist>,
    val english: List<Renglish>,
    val official: List<Rofficial>,
    val russian: List<Rrussian>,
    val streams: List<Rstreams>,
    val winner2: List<Rwinner2>,
    val opponent2: List<Ropponent2>,
    val opponent: List<Ropponent>,
    val videogame: List<Rvideogame>,


)

data class RSerie(
   val full_name: String,
)

data class RResult(
    val score : Int?,
)

data class Rtournament(
   val name: String,
)

data class Rwinner(
   val id: Int?,
)

data class Rgame(
    val begin_at: Date,
    val status: String,
)

data class Rleague(
   val image_url: String?,
   val name: String,
)

data class Rlive(
   val supported: Boolean?,
)

data class Rstreamslist(
   val language: String?,
)

data class Renglish(
   val embed_url: String?,
)

data class Rofficial(
   val embed_url: String?,
)

data class Rrussian(
    val embed_url: String?,
)

data class Rstreams(
    val english: String?,
)

data class Rwinner2(
    val id: Int?,
)

data class Ropponent2(
    val image_url: String?,
    val name: String,
)

data class Ropponent(
    val image_url: String?,
    val name: String,
)

data class Rvideogame(
    val name: String,
)


