package com.denislav.nedev.random.word.generator.di

import com.denislav.nedev.random.word.generator.RandomWordGeneratorApplication
import com.denislav.nedev.random.word.generator.di.modules.AppModule
import com.denislav.nedev.random.word.generator.di.modules.ApplicationBindingModule
import com.denislav.nedev.random.word.generator.di.modules.DatabaseModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        DatabaseModule::class,
        ViewModelBuilderModule::class,
        ApplicationBindingModule::class,
    ]
)
interface AppComponent : AndroidInjector<RandomWordGeneratorApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: RandomWordGeneratorApplication): Builder

        fun build(): AppComponent
    }
}