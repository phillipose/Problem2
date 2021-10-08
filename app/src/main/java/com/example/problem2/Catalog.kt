package com.example.problem2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Shopping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        supportActionBar?.title = "Shop by Category"
    }

    fun startCategoryDetail(type: String) {
        val detailIntent = Intent(this, CatalogDetail::class.java)
        detailIntent.putExtra("TYPE", type)
        startActivity(detailIntent)
    }

    fun onClick(v: View?) {
        when (v?.id) {
            R.id.elc -> startCategoryDetail(getString(R.string.str_electronic))
            R.id.clothing -> startCategoryDetail(getString(R.string.str_clothes))
            R.id.bty -> startCategoryDetail(getString(R.string.str_beauty))
            R.id.fd -> startCategoryDetail(getString(R.string.str_food))
            else -> startCategoryDetail("Nothing")
        }
    }
}