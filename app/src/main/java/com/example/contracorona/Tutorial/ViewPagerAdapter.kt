package com.example.contracorona.Tutorial

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.contracorona.R

data class ViewPagerAdapter(val mContext: Context, val screenIten: ArrayList<ScreenIten>): PagerAdapter() {

    @SuppressLint("ServiceCast")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val inflater: LayoutInflater = LayoutInflater.from(mContext)
        val layoutScreen: View = inflater.inflate(R.layout.activity_screen,null)
        val imgSlide: ImageView = layoutScreen.findViewById(R.id.intro_img)
        val title: TextView = layoutScreen.findViewById(R.id.intro_title)
        val description: TextView = layoutScreen.findViewById(R.id.description)

        title.setText(screenIten.get(position).title)
        description.setText(screenIten.get(position).description)
        imgSlide.setImageResource(screenIten.get(position).screenImg)

        container.addView(layoutScreen)

        return layoutScreen
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return screenIten.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

    }
}