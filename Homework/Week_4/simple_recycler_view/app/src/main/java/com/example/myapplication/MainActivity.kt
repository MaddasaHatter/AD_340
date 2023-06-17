package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv: RecyclerView = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)

        val anime = listOf("Demon Slayer", "My Hero Academia", "Hellsing Ultimate",
            "Full Metal Alchemist Brotherhood", "Dr Stone", "One Piece", "Black Clover", "Erased",
            "Servamp", "Tonikawa:Over The Moon", "Mashle: Magc and Muscle", "Okami-san and her Seven Companions",
            "Skip and Loafer", "Hell's Paradise", "Kaguya-sama: Love is war", "Sugar Apple Fairy tale", "BlackButler")
        rv.adapter = MyAdapter(anime.toList())
    }
}

class MyAdapter(val data: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val textView = row.findViewById<TextView>(R.id.number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view,
            parent, false)
        return MyViewHolder(layout)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = data.get(position).toString()
    }
    override fun getItemCount(): Int = data.size

}