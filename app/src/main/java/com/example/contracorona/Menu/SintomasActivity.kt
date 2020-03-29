package com.example.contracorona.Menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.contracorona.R
import com.example.contracorona.WebView.WebSintomasActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SintomasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sintomas)

        ue.setAnimation("woman.json")
        ue.playAnimation()
        ue.loop(true)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.slide_in_left,
            R.anim.slide_out_right
        )
    }

    fun irParaWebSintoma(view: View) {
        val intencao = Intent (this, WebSintomasActivity::class.java)
        startActivity(intencao)
        overridePendingTransition(
            R.anim.slide_in_right,
            R.anim.slide_out_left
        )
    }
}
