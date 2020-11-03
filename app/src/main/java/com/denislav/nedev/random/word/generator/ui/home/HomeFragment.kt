package com.denislav.nedev.random.word.generator.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.denislav.nedev.random.word.generator.R
import com.denislav.nedev.random.word.generator.databinding.HomeFragmentBinding
import dagger.android.support.DaggerFragment

class HomeFragment : DaggerFragment() {
    private lateinit var binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.home_fragment,
            container,
            false
        )
        return binding.root
    }
}