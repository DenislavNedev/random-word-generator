package com.denislav.nedev.random.word.generator.di.modules

import android.app.Application
import androidx.room.Room
import com.denislav.nedev.random.word.generator.R
import com.denislav.nedev.random.word.generator.database.RandomWordGeneratorDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabase(application: Application): RandomWordGeneratorDatabase =
        Room.databaseBuilder(
            application.applicationContext,
            RandomWordGeneratorDatabase::class.java,
            application.getString(R.string.database_name)
        )
            .fallbackToDestructiveMigration()
            .build()

    @Singleton
    @Provides
    fun providesWordDatabaseDao(database: RandomWordGeneratorDatabase) = database.wordDatabaseDao
}
