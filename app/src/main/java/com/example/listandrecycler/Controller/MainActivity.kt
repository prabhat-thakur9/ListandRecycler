package com.example.listandrecycler.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.listandrecycler.Adapters.CategoryAdapter
import com.example.listandrecycler.Adapters.CategoryRecycleAdapter
import com.example.listandrecycler.Model.Category
import com.example.listandrecycler.R
import com.example.listandrecycler.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter:CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= CategoryRecycleAdapter(this,DataService.categories)
        list_view.adapter=adapter
        val layoutManager= LinearLayoutManager(this)
        list_view.layoutManager=layoutManager
        list_view.setHasFixedSize(true)
    }
}