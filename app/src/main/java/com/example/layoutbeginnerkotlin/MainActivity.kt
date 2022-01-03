package com.example.layoutbeginnerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutbeginnerkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bin: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bin = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bin.root)

        initView()
    }
    private fun initView() {
        bin.btnSecond.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("key","Name: Samandar\nAge: 18")
            startActivity(intent)
        }
    }
}