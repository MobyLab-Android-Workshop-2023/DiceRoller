package com.mobylab.workshop2023_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener { clickOnButton() }
    }

    private fun clickOnButton() {
        val diceValue = Dice(6).roll()
        val imgView : ImageView = findViewById(R.id.imageView)

        Log.e("Dice App", "The value from the dice was $diceValue")

        val imgResource = when(diceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgView.setImageResource(imgResource)
    }

    class Dice(private var faces: Int) {
        fun roll() = (1..faces).random()
    }
}