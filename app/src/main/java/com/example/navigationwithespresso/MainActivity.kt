package com.example.navigationwithespresso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button_next_activity: Button = findViewById(R.id.button_next_activity)
        button_next_activity.setOnClickListener{
            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent)
        }

    }
}