package com.example.week3taskuidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //hides the action bar
        supportActionBar?.hide()
//    initializes the switch button to turn on and off the dark mode
        var switchButton = findViewById<Switch>(R.id.switchButton)
        switchButton.setOnClickListener {
            if (switchButton.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}
