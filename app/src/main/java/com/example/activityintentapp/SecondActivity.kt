package com.example.activityintentapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Welcome to Second Activity!"
            textSize = 24f
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        }
        setContentView(textView)
    }
}
