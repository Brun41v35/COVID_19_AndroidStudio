package com.example.contracorona.Menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.contracorona.R
import com.r0adkll.slidr.Slidr

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        Slidr.attach(this)
    }

    fun irTelaCorona(view: View) {
        val intencao = Intent (this,
            CoronaActivity::class.java)
        startActivity(intencao)
        overridePendingTransition(
            R.anim.slide_in_right,
            R.anim.slide_out_left
        )
    }

    fun irTelaSintoma(view: View) {
        val intencao = Intent (this, SintomasActivity::class.java)
        startActivity(intencao)
        overridePendingTransition(
            R.anim.slide_in_right,
            R.anim.slide_out_left
        )
    }

    fun irTelaPrevencao(view: View) {
        val intencao = Intent (this, PrevencaoActivity::class.java)
        startActivity(intencao)
        overridePendingTransition(
            R.anim.slide_in_right,
            R.anim.slide_out_left
        )
    }

    fun irTelaContato(view: View) {
        val intencao = Intent (this,
            ContatosActivity::class.java)
        startActivity(intencao)
        overridePendingTransition(
            R.anim.slide_in_right,
            R.anim.slide_out_left
        )
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.slide_in_left,
            R.anim.slide_out_right
        )
    }
}
