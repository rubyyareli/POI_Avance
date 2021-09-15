package com.poi.poi_avance_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_equipos.*
import kotlinx.android.synthetic.main.fragment_equipos.view.*
import kotlinx.android.synthetic.main.nav_header.*

class VerEquiposAdapter(val verEquipos:List<VerEquipos>):RecyclerView.Adapter<VerEquiposAdapter.verEquiposHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): verEquiposHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return verEquiposHolder(layoutInflater.inflate(R.layout.fragment_equipos,parent, false))
    }

    override fun onBindViewHolder(holder: verEquiposHolder, position: Int) {
        val tvNombreEquipo=holder.itemView.findViewById<TextView>(R.id.tvNombreEquipo)
    }

    override fun getItemCount(): Int = verEquipos.size

    class verEquiposHolder (val view:View):RecyclerView.ViewHolder(view)
    {
        fun render(verEquipos:VerEquipos)
        {
            view.tvNombreEquipo.text=verEquipos.nombreEquipo
            Picasso.get().load(verEquipos.imagenEquipo).into(view.ivImagenEquipo)
        }
    }



}