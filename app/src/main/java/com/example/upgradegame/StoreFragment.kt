package com.example.upgradegame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class StoreFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_store, container, false)
        view.findViewById<Button>(R.id.menu1).setOnClickListener {
            it.findNavController().navigate(R.id.action_storeFragment_to_mainFragment)
        }

        view.findViewById<Button>(R.id.menu2).setOnClickListener {
            it.findNavController().navigate(R.id.action_storeFragment_to_inventoryFragment)
        }
        return view
    }
}