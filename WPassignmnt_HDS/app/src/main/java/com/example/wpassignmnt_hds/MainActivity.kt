package com.example.wpassignmnt_hds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val q1: Intent = Intent(this,main2::class.java)
        button.setOnClickListener{
            startActivity(q1)
        }

    }
}
