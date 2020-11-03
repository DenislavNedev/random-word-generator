package com.denislav.nedev.random.word.generator.di.modules

import com.denislav.nedev.random.word.generator.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ApplicationBindingModule {

    @ContributesAndroidInjector
    fun mainActivity(): MainActivity
}