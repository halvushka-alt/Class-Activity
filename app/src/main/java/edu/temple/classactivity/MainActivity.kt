package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.myText)
        val editText = findViewById<EditText>(R.id.editTextText)

        findViewById<Button>(R.id.button).setOnClickListener {

            if (editText.text.isNotEmpty()) {

                textView.text = "Hello, " + EditText.text + "! Welcome"

                else {

                        textView.text = "Please enter your name"

                }

            }

        }

    }
}