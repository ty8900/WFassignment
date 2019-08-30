package com.example.wpassignmnt_hds

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class main2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val q1: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://github.com/ty8900/Kingdongseok"))
        val q2: Intent = Intent(this,MainActivity::class.java)
        button2.setOnClickListener{
            startActivity(q1)
        }
        button3.setOnClickListener{
            startActivity(q2)
        }

    }
}
