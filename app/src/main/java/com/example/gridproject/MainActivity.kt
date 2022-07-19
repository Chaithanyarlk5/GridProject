package com.example.gridproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var grid = findViewById<GridView>(R.id.grid)
        var model_list = ArrayList<Model>()
        model_list += Model("A")
        model_list += Model("B")
        model_list += Model("C")
        model_list += Model("D")
        model_list += Model("A")
        var adappter = Adapter(model_list, this@MainActivity)
        grid.adapter = adappter


    }
}