package com.example.contracorona.Menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.contracorona.R
import com.example.contracorona.WebView.WebCoronaActivity
import com.r0adkll.slidr.Slidr
import kotlinx.android.synthetic.main.activity_splash.*

class CoronaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corona)

        ue.setAnimation("virus.json")
        ue.playAnimation()
        ue.loop(true)

        Slidr.attach(this)
    }

    fun irParaWebCorona(view: View){
        val intent = Intent (this, WebCoronaActivity::class.java)
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
