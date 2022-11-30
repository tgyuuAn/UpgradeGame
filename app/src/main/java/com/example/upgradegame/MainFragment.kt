package com.example.upgradegame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        view.findViewById<Button>(R.id.menu2).setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_inventoryFragment)
        }
        view.findViewById<Button>(R.id.menu3).setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_storeFragment)
        }
        return view
    }
}