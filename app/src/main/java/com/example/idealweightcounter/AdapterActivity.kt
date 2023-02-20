package com.example.idealweightcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class AdapterActivity(private val dataset: ArrayList<DataHitung>)
    : RecyclerView.Adapter<AdapterActivity.viewHoledeer>(){
    class viewHoledeer(view:View) : RecyclerView.ViewHolder(view) {
        val nama = view.findViewById<TextView>(R.id.Nama)
        val tinggi = view.findViewById<TextView>(R.id.Tinggi)
        val berat = view.findViewById<TextView>(R.id.Berat)
        val laki = view.findViewById<TextView>(R.id.jkelamin)
//        val hapus = view.findViewById<ImageView>(R.id.Delete)
//        val pr = view.findViewById<TextView>(R.id.perempuan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHoledeer {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapter,parent, false)
        return viewHoledeer(view)
    }

    override fun onBindViewHolder(holder: viewHoledeer, position: Int) {
        val data = dataset[position]
        holder.nama.text = data.Nama
        holder.tinggi.text = data.Tinggi.toString()
        holder.berat.text = data.BB.toString()
        holder.laki.text = data.lk
//        holder.pr.text = data.pr
//        holder.hapus.setOnClickListener {
//            dataset.removeAt(position)
//            notifyItemRangeRemoved(position,dataset.size)
//            notifyDataSetChanged()
//        }
    }

    override fun getItemCount(): Int = dataset.size
}