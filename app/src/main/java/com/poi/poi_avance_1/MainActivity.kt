package com.poi.poi_avance_1

import android.app.Notification
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    val equipos= listOf(
        VerEquipos( "Programacion Orientada a la Internet", "imagen.com"),
        VerEquipos( "Programacion Orientada a la Internet", "imagen.com"),
        VerEquipos( "Programacion Orientada a la Internet", "imagen.com"),
        VerEquipos( "Programacion Orientada a la Internet", "imagen.com"),
    )

    private lateinit var toogle: ActionBarDrawerToggle



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toogle=ActionBarDrawerToggle(this, drawerLayout ,R.string.open_drawer,R.string.close_drawer)
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav_view.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.nav_notificaciones->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, Notificaciones())
                        commit()
                    }
                }


                R.id.nav_vermensajes->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, Chats())
                        commit()
                    }
                }

                R.id.nav_verequipos->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, Equipos())
                        commit()
                    }
                }

                R.id.nav_tareas->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, Tareas())
                        commit()
                    }
                }

                R.id.nav_calendario->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, Calendario())
                        commit()
                    }
                }

                R.id.nav_configuracion->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, Configuracion())
                        commit()
                    }
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}