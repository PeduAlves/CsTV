package com.example.des_fuze.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.des_fuze.R
import com.example.des_fuze.domain.partidasCard

class partidaAdapter(
    private val items: List<partidasCard>
) : RecyclerView.Adapter<partidaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.partida_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: partidasCard) = with(itemView) {
            val imagemTime_1 = findViewById<ImageView>(R.id.imagemTime_1)
            val imagemTime_2 = findViewById<ImageView>(R.id.imagemTime_2)
            val imagemLiga = findViewById<ImageView>(R.id.imagemLiga)
            val nomeTime_1 = findViewById<TextView>(R.id.nomeTime_1)
            val nomeTime_2 = findViewById<TextView>(R.id.nomeTime_2)
            val textoLiga = findViewById<TextView>(R.id.textoLiga)
            val textoSerie = findViewById<TextView>(R.id.textoSerie)
            val textoData = findViewById<TextView>(R.id.textoData)

            // TODO: Load image with Glide

            nomeTime_1.text = item.nameTime_1
            nomeTime_2.text = item.nameTime_2
            textoLiga.text = item.nameLiga
            textoSerie.text = item.nameSerie
            textoData.text = "  ${item.diaPartida}, ${item.horaPartida}  "

        }
    }
}