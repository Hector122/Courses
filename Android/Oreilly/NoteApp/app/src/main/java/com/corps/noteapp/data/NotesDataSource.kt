package com.corps.noteapp.data

import com.corps.noteapp.model.Note

class NotesDataSource {
    fun getNotes(): List<Note> {
        val noteList = mutableListOf<Note>()

        noteList.add(
            Note(
                title = "Note 0",
                description = "This is the description for Note 0 that have more default commen tjust to see how it is look like"
            )
        )
        for (i in 1..10) {
            val note = Note(
                title = "Note $i",
                description = "This is the description for Note $i"
            )
            noteList.add(note)
        }
        return noteList
    }
}
