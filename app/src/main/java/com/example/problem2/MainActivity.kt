package com.example.problem2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val type = intent.getStringExtra("type")
        supportActionBar?.title


    }
    fun startCategoryDetail(type: String) {
        val detailIntent = Intent(this, CatalogDetail::class.java)
        detailIntent.putExtra("TYPE", type)
        startActivity(detailIntent)
    }
    fun onClick(v: View?) {
        when(v?.id) {
            R.id.electronics ->startCategoryDetail(getString(R.string.electronic))
            R.id.clothes ->startCategoryDetail(getString(R.string.clothes))
            R.id.bty ->startCategoryDetail(getString(R.string.beauty))
            R.id.fd ->startCategoryDetail(getString(R.string.food))
            else ->  startCategoryDetail("Please")
        }
    }
}