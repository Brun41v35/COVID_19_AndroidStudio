package com.example.contracorona.Tutorial

import android.app.assist.AssistStructure
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.example.contracorona.Menu.MenuActivity
import com.example.contracorona.R
import com.example.contracorona.WelcomeActivity
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    private lateinit var screenPager: ViewPager
    private lateinit var tabIndicator: TabLayout
    private lateinit var btnNext: Button
    private lateinit var btnGetStarted: Button
    private lateinit var btnAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        //Teste
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        var position:Int = 0

        if (restorePrefData()) {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Hide the action bar
        supportActionBar?.hide()

        val screenPager: ViewPager
        tabIndicator = findViewById(R.id.tab_indicator)
        btnNext = findViewById(R.id.btn_next)
        btnGetStarted = findViewById(R.id.btn_get_started)
        btnAnim = AnimationUtils.loadAnimation(applicationContext,R.anim.button_animation)

        //Preechendo a lista screen
        val mList = ArrayList<ScreenIten>()
        mList.add(
            ScreenIten(
                "COVID_19",
                "Vamos te ajudar a entender um pouco sobre esse virus.",
                R.drawable.img
            )
        )
        mList.add(
            ScreenIten(
                "Formas de Prenção",
                "Nesse momento, precisamos se previnir contra essa virus.",
                R.drawable.im2
            )
        )
        mList.add(
            ScreenIten(
                "Contatos",
                "Vamos indicar outros aplicativos que podem te ajudar muito mais!!",
                R.drawable.im3
            )
        )

        screenPager = findViewById(R.id.screen_viewpager)
        val introViewPagerAdapter = ViewPagerAdapter(this, mList)
        screenPager.adapter = introViewPagerAdapter
        tabIndicator.setupWithViewPager(screenPager)

        btnNext.setOnClickListener{
            position = screenPager.currentItem
            if (position < mList.size) {
                position++
                screenPager.currentItem = position
            }

            if (position == mList.size -1) {
                laodLastScreen()
            }
        }

        btnGetStarted.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)

            savesPrefsData()
            finish()
        }
    }

    private fun restorePrefData(): Boolean {
        val pref: SharedPreferences = application.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val teste: Boolean = pref.getBoolean("TesteMermão",false)
        return teste
    }

    private fun savesPrefsData() {
        val pref: SharedPreferences = application.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = pref.edit()
        editor.putBoolean("TesteMermão",true)
        editor.commit()
    }

    //Mostra o botão GETSTARTED
    private fun laodLastScreen() {
        btnNext.visibility = View.INVISIBLE
        btnGetStarted.visibility = View.VISIBLE
        tabIndicator.visibility = View.INVISIBLE
        btnGetStarted.animation = btnAnim
    }
}
