package com.poi.poi_avance_1

import android.app.Notification
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycleview_equipos.*

class MainEquipos : AppCompatActivity()
{

    var equipos= listOf(
        VerEquipos( "Programacion Orientada a la Internet", "https://cms-assets.tutsplus.com/uploads/users/1499/posts/29820/preview_image/kotlin.jpg")
    )


    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvEquipo.layoutManager=LinearLayoutManager(this)
        val adapter=VerEquiposAdapter(equipos)
        rvEquipo.adapter=adapter


    }





}