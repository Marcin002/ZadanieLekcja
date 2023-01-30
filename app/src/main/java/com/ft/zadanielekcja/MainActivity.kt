package com.ft.zadanielekcja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        findViewById<Button>(R.id.button).setOnClickListener {
            var x=findViewById<TextView>(R.id.editTextTextPassword3).text.toString()
            var y=findViewById<TextView>(R.id.editTextTextPassword4).text.toString()


            if (x==y){
                findViewById<CheckedTextView>(R.id.zgodne).isChecked=true

            }


            for (c in x)
            {

                if (c.isLowerCase())
                {
                    findViewById<CheckedTextView>(R.id.mala).isChecked=true
                }
                if (c.isUpperCase())
                {
                    findViewById<CheckedTextView>(R.id.duza).isChecked=true
                }
            }

            if (x!=y){
                findViewById<CheckedTextView>(R.id.zgodne).isChecked=false
            }





        }
    }
}