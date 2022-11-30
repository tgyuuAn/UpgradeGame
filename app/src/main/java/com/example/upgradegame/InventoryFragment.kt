package com.example.upgradegame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class InventoryFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_inventory, container, false)
        view.findViewById<Button>(R.id.menu1).setOnClickListener {
            it.findNavController().navigate(R.id.action_inventoryFragment_to_mainFragment)
        }
        view.findViewById<Button>(R.id.menu3).setOnClickListener {
            it.findNavController().navigate(R.id.action_inventoryFragment_to_storeFragment)
        }
            return view
    }
}