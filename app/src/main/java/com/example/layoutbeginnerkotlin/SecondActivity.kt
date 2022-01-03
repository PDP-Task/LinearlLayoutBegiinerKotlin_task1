package com.example.layoutbeginnerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutbeginnerkotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var bin: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bin = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bin.root)

        val text = intent.getStringExtra("key")
        bin.textView.text = text.toString()
    }
}