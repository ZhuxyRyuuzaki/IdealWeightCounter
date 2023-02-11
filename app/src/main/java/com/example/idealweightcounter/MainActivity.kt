package com.example.idealweightcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var Nama : EditText
    private lateinit var Tinggi : EditText
    private lateinit var Hasil : TextView
    private lateinit var jkLakiLaki : RadioButton
    private lateinit var jkPerempuan : RadioButton
    private lateinit var process : Button
    private var tb : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nama = findViewById(R.id.etNama)
        Tinggi = findViewById(R.id.etTinggiBdn)
        Hasil = findViewById(R.id.BB)
        jkLakiLaki = findViewById(R.id.Laki2)
        jkPerempuan = findViewById(R.id.Perempuan)
        process = findViewById(R.id.btnHasil)
        //

        process.setOnClickListener {

            val tinggi = Tinggi.text.toString().toInt()
            if (jkLakiLaki.isChecked) {
                tb = (tinggi-100)-((tinggi-100)*0.10).toInt()
                Hasil.setText(tb.toString() + "Kg")
            } else {
                tb = (tinggi-100)-((tinggi-100)*0.15).toInt()
                Hasil.setText(tb.toString() + "Kg")
            }
        }
    }
}