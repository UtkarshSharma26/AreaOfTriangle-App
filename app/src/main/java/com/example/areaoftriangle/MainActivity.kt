package com.example.areaoftriangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            var x=base.text.toString().toInt()
            var y=height.text.toString().toInt()
            result.text="Area: ${AreaOfTriangle(x,y)}"
        }
    }

    private fun AreaOfTriangle(x: Int, y: Int): Int {
        return (x*y)/2
    }
}
