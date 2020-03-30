package com.example.agedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val  year = ed.text.toString()
            val age = Calendar.getInstance().get(Calendar.YEAR)-year.toInt()

            if (age<= 100 && age>0){
                tx.text="your age is "+age.toString()
            }else{
                tx.text="Check the year"
            }

        }
    }
}
