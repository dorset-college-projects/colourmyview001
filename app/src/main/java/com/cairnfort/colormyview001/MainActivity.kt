package com.cairnfort.colormyview001

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners();
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_text_one)
        val boxTwoText = findViewById<TextView>(R.id.box_text_two)
        val boxThreeText = findViewById<TextView>(R.id.box_text_three)
        val boxFourText = findViewById<TextView>(R.id.box_text_four)
        val boxFiveText = findViewById<TextView>(R.id.box_text_five)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)


        val clickableViews: List<View> = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout)

        for(item in clickableViews) {
            item.setOnClickListener{makeColored(it)}
        }

    }

    private fun makeColored(view: View) {


        when(view.id) {

            R.id.box_text_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_text_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_text_three -> view.setBackgroundColor(Color.BLUE)
            R.id.box_text_four -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_text_five -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }


    }
}