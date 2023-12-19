package com.rafael.miproyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, CreditActivity::class.java)
            // Pasar el nombre de usuario al iniciar CreditActivity
            intent.putExtra("USERNAME", editText.text.toString())
            startActivity(intent)
        }
    }
}
