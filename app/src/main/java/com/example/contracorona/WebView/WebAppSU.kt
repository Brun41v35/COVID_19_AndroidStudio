package com.example.contracorona.WebView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.contracorona.R

class WebAppSU : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_app_s_u)

        val web: WebView

        web = findViewById(R.id.webSula)
        web.loadUrl("https://play.google.com/store/apps/details?id=br.com.sulamerica.sam.saude&hl=pt_BR")
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.slide_in_left,
            R.anim.slide_out_right
        )
    }
}
