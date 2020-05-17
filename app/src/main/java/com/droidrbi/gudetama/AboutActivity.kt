package com.droidrbi.gudetama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    lateinit var nameTextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        nameTextView = findViewById(R.id.nameTextView)
        val intent = getIntent()
        val name  = intent.getStringExtra("name")
        nameTextView.text = name

    }
}
