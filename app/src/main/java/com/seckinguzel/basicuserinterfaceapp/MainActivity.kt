package com.seckinguzel.basicuserinterfaceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createSuperHero(view: View) {
        val name = findViewById<TextView>(R.id.nameText)
        val age = findViewById<TextView>(R.id.ageText)
        val power = findViewById<TextView>(R.id.powerText)
        val result = findViewById<TextView>(R.id.resultText)

        val nameText = name.text.toString()
        val ageText = age.text.toString()
        val powerText = power.text.toString()

        result.text = "Name: $nameText, Age: $ageText, Power: $powerText"
    }
}
