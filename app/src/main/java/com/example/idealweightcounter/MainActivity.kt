package com.example.idealweightcounter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var LinearLayoutManager: LayoutManager
    private var bb : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variabel yang berhubungan dengan layout
        val Nama = findViewById<EditText>(R.id.etNama)
        val Tinggi = findViewById<EditText>(R.id.etTinggiBdn)
        val Hasil = findViewById<TextView>(R.id.hasil)
        val jkLakiLaki = findViewById<RadioButton>(R.id.Laki2)
        val jkPerempuan = findViewById<RadioButton>(R.id.Perempuan)
        val process = findViewById<Button>(R.id.btnHasil)

        // Perintah pada tombol process
        process.setOnClickListener {

            val nama = Nama.text.toString()
            val tinggi = Tinggi.text.toString().toInt()

            if (jkLakiLaki.isChecked) {
                bb = (tinggi-100)-((tinggi-100)*0.10).toInt()
                //menampilkan hasil
                Hasil.setText("nama : $nama \nberat badan ideal : "+ bb.toString() + "kg")
            } else if(jkPerempuan.isChecked) {
                bb = (tinggi-100)-((tinggi-100)*0.15).toInt()
                Hasil.setText("nama : $nama \nberat badan ideal : "+ bb.toString() + "kg")
            } else {
                Hasil.setText("Pilih Jenis Kelamin Terlebih dahulu")
            }
        }
    }
}