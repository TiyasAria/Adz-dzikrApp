package com.idn.smart.tiyas.adz_dzikrapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.idn.smart.tiyas.adz_dzikrapp.Model.DataDoaNabi
import com.idn.smart.tiyas.adz_dzikrapp.R

class ViewPagerAdapterDoaNabi (private val dataSlides : List<DataDoaNabi>) :
    RecyclerView.Adapter<ViewPagerAdapterDoaNabi.SlideViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideViewHolder {
        return SlideViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_doa_nabi,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return dataSlides.size
    }

    override fun onBindViewHolder(holder: SlideViewHolder, position: Int) {
        holder.bind(dataSlides[position])
    }


    inner class SlideViewHolder (view : View) : RecyclerView.ViewHolder(view){
        private val textTitle = view.findViewById<TextView>(R.id.judul)
        private val textKeterangan = view.findViewById<TextView>(R.id.keteranganindo)
        private val textKetArab= view.findViewById<TextView>(R.id.keteranganarab)

        fun bind (dataSlide: DataDoaNabi){
            textTitle.text = dataSlide.judul
            textKeterangan.text = dataSlide.keteranganindo
            textKetArab.text = dataSlide.keteranganarab
        }
    }
}