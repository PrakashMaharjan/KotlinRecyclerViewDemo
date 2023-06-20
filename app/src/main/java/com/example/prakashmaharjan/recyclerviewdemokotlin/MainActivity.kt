package com.example.prakashmaharjan.recyclerviewdemokotlin
//import androidx.appcompat.app.AppCompatActivity
//import android.graphics.Color
//import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prakashmaharjan.recyclerviewdemokotlin.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        /*
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = MainAdapter()
        */

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val main_view = binding.root
        setContentView(main_view)
        binding.recyclerViewMain.layoutManager =
            LinearLayoutManager(this)
           // androidx.recyclerview.widget.LinearLayoutManager(this)
        binding.recyclerViewMain.adapter = MainAdapter()
    }
}
