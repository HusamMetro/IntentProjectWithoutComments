package com.tuwaiq.husam.intentproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonNextPage: Button
    private lateinit var myText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNextPage = findViewById(R.id.btnNextActivity)
        myText = findViewById(R.id.textView)

        buttonNextPage.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("basha", "hello ya Basha")
            // startActivity(i)
            startActivityForResult(i, 3)
        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 3) {
            if (resultCode == RESULT_OK) {
                myText.text = "Everything is ok"
                myText.setTextSize(50f)
            } else {
                myText.text = "I Automatically got result (RESULT_CANCELED)  "
                myText.setTextSize(15f)
            }
        }
    }

}