package com.denislav.nedev.random.word.generator.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.denislav.nedev.random.word.generator.data.word.Word

@Dao
interface WordDatabaseDao {
    @Insert
    fun insert(word: Word)

    @Delete
    fun delete(word: Word)

    @Query("SELECT * FROM words")
    fun getAllWords(): LiveData<List<Word>>

    @Query("SELECT * FROM words WHERE level=:level")
    fun getWordsByLevel(level: Int): LiveData<List<Word>>
}
