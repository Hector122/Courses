package com.corps.noteapp.repository

import com.corps.noteapp.data.NoteDao
import com.corps.noteapp.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDao: NoteDao) {

    fun getAllNotes(): Flow<List<Note>> = noteDao.getAllNotes().flowOn(Dispatchers.IO).conflate()

    suspend fun addNote(note: Note) = noteDao.insert(note)

    suspend fun update(note: Note) = noteDao.update(note)

    suspend fun deleteNote(note: Note) = noteDao.deleteNote(note)

    suspend fun deleteAllNotes() = noteDao.deleteAll()

}
