package com.example.prakashmaharjan.recyclerviewdemokotlin
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prakashmaharjan.recyclerviewdemokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val main_view = binding.root
        setContentView(main_view)
        binding.recyclerViewMain.layoutManager =
            LinearLayoutManager(this)
        binding.recyclerViewMain.adapter = MainAdapter()
    }
}
