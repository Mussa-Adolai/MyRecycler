package com.example.kt9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class RecyclerFragment : Fragment() {
var recycler:RecyclerView? =null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //recycler = view?.findViewById(R.id.recycler)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recycler, container, false)
        recycler = view?.findViewById(R.id.recycler)
        return  view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recycler?.layoutManager = LinearLayoutManager(this.context,RecyclerView.VERTICAL,false)


        recycler?.adapter = Custom_Adapter()


    }


}