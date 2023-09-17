package com.babaiyu.latihan_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BulanAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<BulanAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.textView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.text_row_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }

    override fun getItemCount() = dataSet.size
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet = arrayOf(
            "Januari",
            "Februari",
            "Maret",
            "April",
            "Mei",
            "Juni",
            "Juli",
            "Agustus",
            "September",
            "Oktober",
            "November",
            "Desember",
            "Januari-1",
            "Februari-2",
            "Maret-3",
            "April-4",
            "Mei-5",
            "Juni-6",
            "Juli-7",
            "Agustus-8",
            "September-9",
            "Oktober-10",
            "November-11",
            "Desember-12",
        )
        val adapter = BulanAdapter(dataSet)

        val rvBulan: RecyclerView = findViewById(R.id.rv_month)
        rvBulan.layoutManager = LinearLayoutManager(this)
        rvBulan.adapter = adapter
    }
}