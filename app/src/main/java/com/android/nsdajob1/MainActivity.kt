package com.android.nsdajob1


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(Intent(this@MainActivity,ProductaActivity::class.java))
            finish()

        },3000)
    }
}