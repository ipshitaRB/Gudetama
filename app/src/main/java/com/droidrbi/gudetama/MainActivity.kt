package com.droidrbi.gudetama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var inputTextField:TextInputEditText
    lateinit var aboutButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputTextField = findViewById(R.id.nameTextField)
        aboutButton = findViewById(R.id.aboutMeButton)

        aboutButton.setOnClickListener { introduceGudetama() }
    }

    private fun introduceGudetama() {
        val name: String = inputTextField.text.toString()
        val intent = Intent(this@MainActivity, AboutActivity::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }
}
