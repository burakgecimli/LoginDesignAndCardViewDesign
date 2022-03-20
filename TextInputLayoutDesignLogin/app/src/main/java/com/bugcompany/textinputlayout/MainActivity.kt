package com.bugcompany.textinputlayout

import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.doOnAttach
import com.bugcompany.textinputlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            buttonGiris.setOnClickListener {
                val ePosta = editTextEposta.text.toString().trim()
                val telefon = editTextTelefon.text.toString().trim()
                val sifre = editTextSifre.text.toString().trim()

                if (!TextUtils.isEmpty(ePosta) && !TextUtils.isEmpty(telefon)&&!TextUtils.isEmpty(sifre)){
                    Toast.makeText(this@MainActivity, "$ePosta-$telefon-$sifre", Toast.LENGTH_SHORT).show()
                }


            }





        }

    }

}

