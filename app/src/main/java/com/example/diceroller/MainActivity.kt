package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvdice : TextView = findViewById(R.id.tvdice)

        val imgdice : ImageView = findViewById(R.id.imgdice)

        val btnrollnow : Button = findViewById(R.id.btnrollnow)

        btnrollnow.setOnClickListener{

            val randomNum = (1..6).random()
            if(randomNum==1)
            {
                imgdice.setImageResource(R.drawable.dice1)
            }
            else if(randomNum==2)
            {
                imgdice.setImageResource(R.drawable.dice2)
            }
            else if(randomNum==3)
            {
                imgdice.setImageResource(R.drawable.dice3)
            }
            else if(randomNum==4)
            {
                imgdice.setImageResource(R.drawable.dice4)
            }
            else if(randomNum==5)
            {
                imgdice.setImageResource(R.drawable.dice5)
            }
            else if(randomNum==6)
            {
                imgdice.setImageResource(R.drawable.dice6)
            }
        }

    }
}