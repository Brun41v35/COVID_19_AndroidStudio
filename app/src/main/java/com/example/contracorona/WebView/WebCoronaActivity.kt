package com.example.contracorona.WebView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.contracorona.R
import com.r0adkll.slidr.Slidr

class WebCoronaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webcorona)

        Slidr.attach(this)

        //Criando a variavel
        val web: WebView

        //Referenciando com o ID
        web = findViewById(R.id.web)
        web.loadUrl("https://coronavirus.saude.gov.br")
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.slide_in_left,
            R.anim.slide_out_right
        )
    }
}
