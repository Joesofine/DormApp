package com.example.dormapp.ui.cleaning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dormapp.R

class CleaningFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_cleaning, container, false)
    }
}