package com.example.contracorona.WebView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.contracorona.R
import com.r0adkll.slidr.Slidr

class WebAppSUSActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_app_s_u_s)

        Slidr.attach(this)

        //Criando a variavel
        val web: WebView

        //Referenciando com o ID
        web = findViewById(R.id.web)
        web.loadUrl("https://play.google.com/store/apps/details?id=br.gov.datasus.guardioes")
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.slide_in_left,
            R.anim.slide_out_right
        )
    }
}
