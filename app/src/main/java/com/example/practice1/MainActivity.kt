package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name_text = findViewById(R.id.nametxt) as TextView
        var email_text = findViewById(R.id.emailtxt) as TextView
        var name = findViewById(R.id.name) as EditText
        var email = findViewById(R.id.email) as EditText
        var btn = findViewById(R.id.btn) as Button

        btn.setOnClickListener{

            var user_name = name.text.toString()
            var user_email = email.text.toString()

            name_text.text = user_name
            email_text.text = user_email

        }


    }
}