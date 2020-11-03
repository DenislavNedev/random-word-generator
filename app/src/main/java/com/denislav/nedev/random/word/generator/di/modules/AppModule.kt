package com.denislav.nedev.random.word.generator.di.modules

import android.app.Application
import com.denislav.nedev.random.word.generator.RandomWordGeneratorApplication
import dagger.Module
import dagger.Provides

@Module
object AppModule {
    @Provides
    fun provideContext(application: RandomWordGeneratorApplication): Application = application
}
