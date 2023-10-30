package com.example.placesage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val delhi = findViewById<Button>(R.id.del)
        val mumbai = findViewById<Button>(R.id.mum)
        val bang = findViewById<Button>(R.id.ban)
        val kolkata = findViewById<Button>(R.id.kol)
        val bhopal = findViewById<Button>(R.id.bho)
        val exit = findViewById<Button>(R.id.exit)

        delhi.setOnClickListener {
            intent = Intent(applicationContext, Delhi::class.java)
            startActivity(intent)
        }
        mumbai.setOnClickListener {
            intent = Intent(applicationContext, Mumbai::class.java)
            startActivity(intent)
        }
        bang.setOnClickListener {
            intent = Intent(applicationContext, Bangalore::class.java)
            startActivity(intent)
        }
        kolkata.setOnClickListener {
            intent = Intent(applicationContext, Kolkata::class.java)
            startActivity(intent)
        }
        bhopal.setOnClickListener {
            intent = Intent(applicationContext, Bhopal::class.java)
            startActivity(intent)
        }
        exit.setOnClickListener {
            ActivityCompat.finishAffinity(this)
        }


    }
}