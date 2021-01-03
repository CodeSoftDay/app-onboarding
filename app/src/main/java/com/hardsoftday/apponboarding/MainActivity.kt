package com.hardsoftday.apponboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.hardsoftday.apponboarding.adapter.OnBoardingViewPagerAdapter
import com.hardsoftday.apponboarding.model.OnBoardingData

class MainActivity : AppCompatActivity() {

     var onBoardingViewPagerAdapter: OnBoardingViewPagerAdapter? = null
    var tabLayout: TabLayout? = null
    var onBoardingViewPager : ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tab_indicator)

        // Lets add data to our model class

        val onBoardingData:MutableList<OnBoardingData> = ArrayList()
        onBoardingData.add(OnBoardingData("Fresh Food", "Con las frutas más frescas de la ciudad", R.drawable.img1))
        onBoardingData.add(OnBoardingData("Fast Delivery", "Servico delivery mas rapido y confiable", R.drawable.img2))
        onBoardingData.add(OnBoardingData("Easy Payment", "Son dolores de cabeza al hacer los pagos ", R.drawable.img3))

        setOnBoardingViewPagerAdapter(onBoardingData)

    }

    private fun setOnBoardingViewPagerAdapter(onBoardingData: List<OnBoardingData>) {

        onBoardingViewPager = findViewById(R.id.screenPager)
        onBoardingViewPagerAdapter = OnBoardingViewPagerAdapter(this, onBoardingData)
        onBoardingViewPager!!.adapter = onBoardingViewPagerAdapter
        tabLayout?.setupWithViewPager(onBoardingViewPager)

    }

}