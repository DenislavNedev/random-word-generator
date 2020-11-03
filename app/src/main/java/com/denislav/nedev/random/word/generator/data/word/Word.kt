package com.denislav.nedev.random.word.generator.data.word

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words")
data class Word(
    val value: String,
    val level: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)