package com.corps.noteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.corps.noteapp.model.Note
import com.corps.noteapp.util.ConvertDate
import com.corps.noteapp.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(ConvertDate::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDatabaseDao(): NoteDao

}
