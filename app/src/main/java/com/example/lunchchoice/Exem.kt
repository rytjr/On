package com.example.lunchchoice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lunchchoice.databinding.ReciclerListBinding

class Exem (var list: ArrayList<ItemList>):  RecyclerView.Adapter<Exem.ListAdapter>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter {
        return ListAdapter(ReciclerListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ListAdapter, position: Int) {
        holder.food.setImageResource(list.get(position).food)
        holder.name.text = list.get(position).name

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ListAdapter(private val binding: ReciclerListBinding): RecyclerView.ViewHolder(binding.root) {
        val food = binding.pickture
        val name = binding.textImg
    }
}