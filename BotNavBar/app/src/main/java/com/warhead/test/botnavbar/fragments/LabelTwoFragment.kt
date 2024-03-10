package com.warhead.test.botnavbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.warhead.test.botnavbar.R
import com.warhead.test.botnavbar.databinding.FragmentLabelTwoBinding


class LabelTwoFragment : Fragment() {
    private lateinit var binding: FragmentLabelTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLabelTwoBinding.inflate(layoutInflater)

        //logic here

        return binding.root
    }

    companion object {

    }
}