package com.example.problem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_catalog_detail.*

class CatalogDetail : AppCompatActivity() {

    lateinit var strings: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog_detail)

        val type = intent.getStringExtra("TYPE")
        strings = when(type) {
            getString(R.string.clothes) -> resources.getStringArray(R.array.clothes)
            getString(R.string.electronic) -> resources.getStringArray(R.array.electronics)
            getString(R.string.beauty) -> resources.getStringArray(R.array.beauty)
            else -> resources.getStringArray(R.array.food)
        }
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings)

        list1.adapter = adapter
        list1.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
        }
    }
}