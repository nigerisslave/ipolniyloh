package com.example.ipolniyloh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val l = findViewById<TextView>(R.id.text)
        val loh = findViewById<Button>(R.id.but)
        val loh1 = findViewById<Button>(R.id.button2)
        val loh2 = findViewById<Button>(R.id.button3)
        var polniy = 0
        val i = 909886777
        loh.setOnClickListener {
            polniy++
            l.text = polniy.toString()
        }
        loh1.setOnClickListener {
            polniy -= 100
            l.text = polniy.toString()
        }
        loh2.setOnClickListener {
            polniy += i
            l.text = polniy.toString()
        }

    }
}