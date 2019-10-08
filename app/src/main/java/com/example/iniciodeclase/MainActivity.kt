package com.example.iniciodeclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myText: TextView = findViewById(R.id.button_id)


        var contador=0;

        val myTextView : TextView = findViewById(R.id.txtid)

        val myButton : Button = findViewById(R.id.button_id)

        myButton.setOnClickListener{

            contador++
            myTextView.text =  " "+contador;

            Toast.makeText(MainActivity@this,"Button Pressed", Toast.LENGTH_SHORT).show()


}
    }

    }