package com.example.recyclerviewdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemList:ArrayList<Int>
    private lateinit var itemAdapter: Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        itemList = ArrayList()
        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        addTOList()
        itemAdapter= Adapter(itemList)
        recyclerView.adapter= itemAdapter
    }
    private fun addTOList(){
        itemList.add(R.drawable.image)
        itemList.add(R.drawable.image2)
        itemList.add(R.drawable.image3)
        itemList.add(R.drawable.image4)
        itemList.add(R.drawable.image8)
        itemList.add(R.drawable.image6)
        itemList.add(R.drawable.image7)
        itemList.add(R.drawable.image)
    }

}