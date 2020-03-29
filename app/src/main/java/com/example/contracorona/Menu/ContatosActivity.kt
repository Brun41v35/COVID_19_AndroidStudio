package com.example.contracorona.Menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.contracorona.R
import com.example.contracorona.WebView.WebAppSU
import com.example.contracorona.WebView.WebAppSUSActivity
import com.example.contracorona.WebView.WepAppEistenActivity
import kotlinx.android.synthetic.main.activity_contatos.*
import kotlinx.android.synthetic.main.activity_splash.ue

class ContatosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)

        ue.setAnimation("work.json")
        ue.playAnimation()
        ue.loop(true)

        teste.setAnimation("home.json")
        teste.playAnimation()
        teste.loop(true)
    }

    fun irParaWebSUS(view: View){
        val intent = Intent (this, WebAppSUSActivity::class.java)
        startActivity(intent)
        overridePendingTransition(
            R.anim.slide_in_right,
            R.anim.slide_out_left
        )
    }

    fun irParaWebEisten(view: View){
        val intent = Intent (this,
            WepAppEistenActivity::class.java)
        startActivity(intent)
        overridePendingTransition(
            R.anim.slide_in_right,
            R.anim.slide_out_left
        )
    }

    fun irParaWebSULA(view: View){
        val intent = Intent (this, WebAppSU::class.java)
        startActivity(intent)
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
