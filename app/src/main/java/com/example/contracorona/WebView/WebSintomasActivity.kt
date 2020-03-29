package com.example.contracorona.WebView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.contracorona.R
import com.r0adkll.slidr.Slidr

class WebSintomasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_sintomas)

        Slidr.attach(this)

        //Criando a variavel
        val web: WebView

        //Referenciando com o ID
        web = findViewById(R.id.web)
        web.loadUrl("https://oglobo.globo.com/sociedade/coronavirus-servico/aprenda-diferenciar-os-sintomas-entre-resfriado-comum-covid-19-24320992")
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.slide_in_left,
            R.anim.slide_out_right
        )
    }
}
