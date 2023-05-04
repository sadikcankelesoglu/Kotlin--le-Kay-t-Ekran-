package com.example.kayituygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kayituygulamasi.databinding.ActivityMainBinding
import com.example.kayituygulamasi.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNextBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val intentFromMain= intent

        val isim=intentFromMain.getStringExtra("isim")
        val soyisim=intentFromMain.getStringExtra("soyisim")
        val eposta=intentFromMain.getStringExtra("eposta")
        val sifre=intentFromMain.getIntExtra("sifre",10)
        binding.isimTxt.text="isim: ${isim}"
        binding.soyisimTxt.text="soyisim: ${soyisim}"
        binding.epostaTxt.text="eposta: ${eposta}"
        binding.sifreTxt.text="sifre: *******"
    }
    fun Onceki(view: View){
        val intent= Intent(this@NextActivity,MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}