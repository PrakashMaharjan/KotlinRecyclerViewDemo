package com.example.prakashmaharjan.recyclerviewdemokotlin
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prakashmaharjan.recyclerviewdemokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.recyclerViewMain) { view, insets ->
            val navBars = insets.getInsets(WindowInsetsCompat.Type.navigationBars())

            view.setPadding(
                view.left,
                view.top,
                view.right,
                navBars.bottom
            )

            insets
        }

        binding.recyclerViewMain.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewMain.adapter = MainAdapter()
        binding.recyclerViewMain.clipToPadding = false



    }
}
