package com.example.listandrecycler.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.listandrecycler.Adapters.CategoryAdapter
import com.example.listandrecycler.Model.Category
import com.example.listandrecycler.R
import com.example.listandrecycler.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter:CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= CategoryAdapter(this,DataService.categories)
        list_view.adapter=adapter
    }
}