package com.example.pantallasmodelo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio_activity)

        val btn: Button = findViewById(R.id.buttonLog)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, loguin_activity::class.java)
            startActivity(intent)

            val btn: Button = findViewById(R.id.buttonSing)
            btn.setOnClickListener {

                val intent: Intent = Intent(this, singup_activity::class.java)
                startActivity(intent)

            }
        }


    }
}