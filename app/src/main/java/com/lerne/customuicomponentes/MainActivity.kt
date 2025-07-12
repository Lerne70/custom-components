package com.lerne.customuicomponentes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.lerne.customuicomponentes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.ctvTitulo.setTitle("Este es un titulo personalizado")
        binding.ctvRating.rating = 3.5f
        binding.ctvInfoCard.setData("Titulo", "Esta es una descripcion personalizada")

        binding.cutomAvatar.nombreUsuario = "Luis Aranda"
        binding.cutomAvatar.imagenUrl = "https://fastly.picsum.photos/id/237/50/50.jpg?hmac=9cCVRLgc5HmY_XbEZ4SSgnaR5CqTMUtHPZ04MCvtH-k"

//        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}