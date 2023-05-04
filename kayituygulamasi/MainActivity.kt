package com.example.kayituygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.kayituygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        Toast.makeText(this,"Hosgeldiniz", Toast.LENGTH_LONG).show()
    }
    fun Sonraki(view: View){
        val intent= Intent(this@MainActivity,NextActivity::class.java)
        intent.putExtra("isim",binding.isimtext.text.toString())
        intent.putExtra("soyisim",binding.soyisimtext.text.toString())
        intent.putExtra("eposta",binding.epostatext.text.toString())
        intent.putExtra("sifre",10)

        val alert=AlertDialog.Builder(this@MainActivity)
        alert.show()
        Toast.makeText( this@MainActivity, "Kayit Basarili!", Toast.LENGTH_LONG).show()

        startActivity(intent)
        finish()
    }
}