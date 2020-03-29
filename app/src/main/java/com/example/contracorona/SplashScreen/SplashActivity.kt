package com.example.contracorona.SplashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.contracorona.R
import com.example.contracorona.WelcomeActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // This method will be executed once the timer is over
        Handler().postDelayed({

            //Start your app main activity
            startActivity(Intent(this, WelcomeActivity::class.java))

            //close this activity
            finish()
        }, SPLASH_TIME_OUT)

        ue.setAnimation("loadevirus.json")
        ue.playAnimation()
        ue.loop(true)
    }
}
