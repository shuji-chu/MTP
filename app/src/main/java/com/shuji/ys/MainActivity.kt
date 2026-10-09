package com.shuji.ys

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputLink = findViewById<EditText>(R.id.inputLink)
        val btnConnect = findViewById<Button>(R.id.btnConnect)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)

        btnConnect.setOnClickListener {
            val link = inputLink.text.toString().trim()
            if (link.isEmpty()) {
                tvStatus.text = "请粘贴 MTP 链接"
                return@setOnClickListener
            }
            tvStatus.text = "已接收到链接，功能开发中"
        }
    }
}
