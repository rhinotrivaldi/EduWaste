package com.rhinotrivaldi.eduwaste.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rhinotrivaldi.eduwaste.*
import com.rhinotrivaldi.eduwaste.adapter.ListLimbahAdapter


class MateriFragment : Fragment() {

    private lateinit var rvLimbah1: RecyclerView
    private var list: ArrayList<Limbah> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvLimbah1 = view.findViewById(R.id.rvMateri)
        rvLimbah1.setHasFixedSize(true)

        list.addAll(DataLimbah.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvLimbah1.layoutManager = LinearLayoutManager(context)
        val listLimbahAdapter =
            ListLimbahAdapter(list)
        rvLimbah1.adapter = listLimbahAdapter


    }



}
