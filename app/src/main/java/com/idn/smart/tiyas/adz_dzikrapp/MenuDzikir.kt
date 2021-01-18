package com.idn.smart.tiyas.adz_dzikrapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_menu_dzikir.*

class MenuDzikir : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_dzikir)

        dzikirpagi.setOnClickListener(this)
        dzikirmalam.setOnClickListener(this)
        doanabi.setOnClickListener(this)
        dzikirtiapsaat.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.dzikirpagi -> {
                val intentMove = Intent(this, PagiActivity::class.java)
                startActivity(intentMove)
            }

            R.id.dzikirmalam -> {
                val intentMove2 = Intent(this,ActivitySore::class.java)
                startActivity(intentMove2)
            }

            R.id.doanabi -> {
                val intentMove3 = Intent(this,DoaNabiActivity::class.java)
                startActivity(intentMove3)
            }

            R.id.dzikirtiapsaat -> {
                val intentMove4 = Intent(this,DzikirActivity::class.java)
                startActivity(intentMove4)
            }


        }
    }
}