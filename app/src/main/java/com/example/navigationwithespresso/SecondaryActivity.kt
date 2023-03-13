package com.example.navigationwithespresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        val button_back: Button = findViewById(R.id.button_back)
        button_back.setOnClickListener{
            finish()
        }
    }
}