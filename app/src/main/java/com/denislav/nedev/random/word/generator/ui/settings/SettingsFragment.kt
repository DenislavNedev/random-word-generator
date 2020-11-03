package com.denislav.nedev.random.word.generator.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.denislav.nedev.random.word.generator.R
import com.denislav.nedev.random.word.generator.databinding.SettingsFragmentBinding
import dagger.android.support.DaggerFragment

class SettingsFragment : DaggerFragment() {
    private lateinit var binding: SettingsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.settings_fragment,
            container,
            false
        )
        return binding.root
    }
}