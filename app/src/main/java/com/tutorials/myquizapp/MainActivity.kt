package com.tutorials.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)

        val etName : TextView = findViewById(R.id.etName)

        btnStart.setOnClickListener{

            if(etName.text.isEmpty() || etName.text.length < 3){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }

        }

    }
}