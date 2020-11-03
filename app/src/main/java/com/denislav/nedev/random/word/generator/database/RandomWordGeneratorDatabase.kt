package com.denislav.nedev.random.word.generator.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.denislav.nedev.random.word.generator.data.word.Word

@Database(entities = [Word::class], version = 1, exportSchema = false)
abstract class RandomWordGeneratorDatabase : RoomDatabase() {

    abstract val wordDatabaseDao: WordDatabaseDao
}
