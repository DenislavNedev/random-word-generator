package com.denislav.nedev.random.word.generator.di.modules

import com.denislav.nedev.random.word.generator.ui.home.HomeFragment
import com.denislav.nedev.random.word.generator.ui.main.MainActivity
import com.denislav.nedev.random.word.generator.ui.settings.SettingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ApplicationBindingModule {

    @ContributesAndroidInjector
    fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    fun homeFragment(): HomeFragment

    @ContributesAndroidInjector
    fun settingsFragment(): SettingsFragment
}