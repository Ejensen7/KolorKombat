package com.erikjensenworks.kolorkombat

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private lateinit var tvTitle: TextView
    private lateinit var buttColorPicker: Button
    private lateinit var buttColorMatcher: Button
    private lateinit var buttColorList: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTitle = findViewById(R.id.tvTitle)
        buttColorPicker = findViewById(R.id.buttColorPicker)
        buttColorMatcher = findViewById(R.id.buttColorMatcher)
        buttColorList = findViewById(R.id.buttColorList)

        buttColorPicker.setOnClickListener {
            val intent = Intent(this, ColorPicker::class.java)
            startActivity(intent)
        }

        buttColorMatcher.setOnClickListener {
            val intent = Intent(this, ColorMatcher::class.java)
            startActivity(intent)
        }

        buttColorList.setOnClickListener {
            val intent = Intent(this, ColorList::class.java)
            startActivity(intent)
        }
    }
}