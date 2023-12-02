package com.dicoding.scancare.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.scancare.databinding.ActivityScanImageBinding

class ScanImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScanImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScanImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageUriString = intent.getStringExtra("imageUri")
        val imageUri = Uri.parse(imageUriString)

        binding.photo.setImageURI(imageUri)
        binding.btnUpload.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}