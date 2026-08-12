package com.example.myapplicationgibranapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        val mainView = findViewById<android.view.View>(R.id.main)
        val btnExplore = findViewById<Button>(R.id.btnExplore)

        ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnExplore.setOnClickListener {
            // Tampilkan Snackbar sesuai tugas Day 1
            Snackbar.make(mainView, getString(R.string.snackbar_text), Snackbar.LENGTH_SHORT).show()
            
            // Lanjut ke ProfileActivity sesuai alur tugas Day 2
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}