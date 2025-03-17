package com.example.way

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.way.databinding.FragmentFactBinding

class FactFragment : Fragment() {

    companion object {
        const val ARGS_FACT = "fact"
    }

    private lateinit var binding: FragmentFactBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fact = requireArguments().getString(ARGS_FACT)
        binding.fact.text = fact

        binding.imageButton.setOnClickListener {  }

        binding.back.setOnClickListener { }

    }

}