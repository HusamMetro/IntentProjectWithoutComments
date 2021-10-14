package com.tuwaiq.husam.intentproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var txtView: TextView
    private lateinit var buttonSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receivedText = intent.getStringExtra("basha")

        txtView = findViewById(R.id.txtSecond)
        buttonSend = findViewById(R.id.btnSendDataBack)

        buttonSend.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
        txtView.text = receivedText
        txtView.setTextSize(60f)
    }
}