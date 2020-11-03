package com.denislav.nedev.random.word.generator

import androidx.databinding.DataBindingUtil
import com.denislav.nedev.random.word.generator.di.DaggerAppComponent
import com.denislav.nedev.random.word.generator.ui.binding.AppDataBindingComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class RandomWordGeneratorApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        DataBindingUtil.setDefaultComponent(AppDataBindingComponent())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder().application(this@RandomWordGeneratorApplication).build()
}