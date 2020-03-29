package com.example.contracorona.WebView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.contracorona.R
import com.r0adkll.slidr.Slidr

class WebPrevencaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_prevencao)

        Slidr.attach(this)

        val web: WebView

        web = findViewById(R.id.web)
        web.loadUrl("https://g1.globo.com/bemestar/coronavirus/noticia/2020/02/27/como-se-prevenir-do-coronavirus.ghtml")
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.slide_in_left,
            R.anim.slide_out_right
        )
    }
}
