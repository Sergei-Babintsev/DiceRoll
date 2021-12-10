package com.sergei.diceroll

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AboutFragmentDice : Fragment() {

    lateinit var developersRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about_dice, container, false)

        val developerNames:List<String> = listOf("Sergei")

        developersRecyclerView = view.findViewById(R.id.developers_recycle_view)
        developersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        developersRecyclerView.adapter=DeveloperAdapter(developerNames)


        return view

    }

}