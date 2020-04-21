package com.rhinotrivaldi.eduwaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity

class PopUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up)

        initDisplay()
    }

    private fun initDisplay() {
        val dm = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(dm)
        window.setLayout(1000, 1000)

        val params = window.attributes
        params.gravity = Gravity.CENTER
        params.x = 0
        params.y = -20
        window.attributes = params
    }
}
