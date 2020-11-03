package com.denislav.nedev.random.word.generator.ui.main

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.denislav.nedev.random.word.generator.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNavController()
    }

    private fun initNavController() {

        findNavController(R.id.nav_host_fragment).let { navController ->
            bottom_navigation.setupWithNavController(navController)
            toolbar.setupWithNavController(
                navController,
                AppBarConfiguration(findNavController(R.id.nav_host_fragment).graph)
            )

            navController.addOnDestinationChangedListener { _, destination, _ ->
                bottom_navigation.visibility = View.VISIBLE
                setSupportActionBar(toolbar)
                when (destination.id) {
                    R.id.settingsFragment -> {
                        toolbar.title = getString(R.string.settings)
                        supportActionBar?.setDisplayHomeAsUpEnabled(false)
                    }
                    R.id.homeFragment -> {
                        toolbar.title = getString(R.string.home)
                        supportActionBar?.setDisplayHomeAsUpEnabled(false)
                    }
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp()
    }
}