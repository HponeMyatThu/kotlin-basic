package com.example.helloword

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val mainTitleElement = findViewById<TextView>(R.id.txt_title)
        val textBodyElement = findViewById<TextView>(R.id.txt_body)
        val editMessageElement = findViewById<EditText>(R.id.edt_message)
        val buttonSubmitElement = findViewById<Button>(R.id.btn_submit)
        val showMessageElement = findViewById<TextView>(R.id.txt_your_message)

        val mainTitle = "Student Information"
        val textBody: String =
            "Welcome to the Student Information section. Here you can view, edit, and manage student records easily. " +
                    "This area provides guidance, details, and useful instructions to help you navigate the app. " +
                    "The text is intentionally a bit longer so you can also test how scrolling, text wrapping, and spacing " +
                    "behave on different screen sizes."

        mainTitleElement.text = mainTitle
        textBodyElement.text = textBody

        buttonSubmitElement.setOnClickListener {
            val input = editMessageElement.text.toString().trim()

            if (input.isEmpty()) {
                showMessageElement.text = ""
                Toast.makeText(this, "Please enter a message", Toast.LENGTH_SHORT).show()
            } else {
                showMessageElement.text = "You entered: $input"
            }
        }
    }
}