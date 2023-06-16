package com.corps.noteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.corps.noteapp.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDatabaseDao(): NoteDao

}
