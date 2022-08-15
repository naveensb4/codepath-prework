package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//handle user interactio in the kotlin file
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //show the layout file activity_main from the activity_main.xml file
        setContentView(R.layout.activity_main)

        //Change background color when user taps button
        //1. Add a button to our layout

        //2. Set up logic to know when the user has tapped on the button
        //Get a rereference to our button
        findViewById<Button>(R.id.button).setOnClickListener{
            //handles user interaction
            //3. Change the color of the text
            Log.i("Naveen", "Tapped on Button")

            //change the color of the text
                //1. Get the reference to textview
                //2. Set the new color of text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))


        }


    }
}