package com.example.des_fuze.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.des_fuze.R
import com.example.des_fuze.api.partidaRepository
import com.example.des_fuze.domain.partidasCard
import com.example.des_fuze.view.PartidaPage as PartidaPage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPartidas)

        val match = partidasCard(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png",
            ".",
            ".",
            "Sengoku gaming",
            "Sengoku gaming",
            "Champions",
            "Serie B",
            "03/12",
            "12:00",
        )

        val partidasApi = partidaRepository.getPartidas()

        val partidas = listOf(match, match, match, match, match, match, match, match)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = partidaAdapter(partidas)
    }
//    private fun irParaPartPage(){
//        var partPage: Intent = Intent(this, PartidaPage::class.java)
//        startActivity(partPage)
//    }
}