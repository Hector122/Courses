package com.corps.noteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.corps.noteapp.data.NoteDataSource
import com.corps.noteapp.model.Note

class NoteViewModel : ViewModel() {

    var noteList = mutableStateListOf<Note>()


    init {
        noteList.addAll(NoteDataSource().getNotes())
    }


    fun addNote(note: Note) {
        noteList.add(note)
    }

    fun removeNote(note: Note) {
        noteList.remove(note)
    }
}
