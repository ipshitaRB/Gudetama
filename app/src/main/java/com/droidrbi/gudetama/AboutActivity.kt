package com.droidrbi.gudetama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class AboutActivity : AppCompatActivity() {

    lateinit var nameTextView:TextView
    lateinit var notYetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        nameTextView = findViewById(R.id.nameTextView)
        val intent = getIntent()
        val name  = intent.getStringExtra("name")
        nameTextView.text = name

        notYetButton = findViewById(R.id.notYetButton)
        notYetButton.setOnClickListener { sigh() }

    }

    private fun sigh() {
        Toast.makeText(this, getString(R.string.disappointed),Toast.LENGTH_SHORT).show()
    }
}
