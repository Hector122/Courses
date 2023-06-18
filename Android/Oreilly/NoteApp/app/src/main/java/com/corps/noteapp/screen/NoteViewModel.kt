package com.corps.noteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corps.noteapp.data.NoteDataSource
import com.corps.noteapp.model.Note
import com.corps.noteapp.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.distinctUntilChangedBy
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(private val repository: NoteRepository) : ViewModel() {

    //var noteList = mutableStateListOf<Note>()

    private val _noteList = MutableStateFlow<List<Note>>(emptyList())
    val noteList = _noteList.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getAllNotes().distinctUntilChanged()
                .collect { listOfNote ->
                    if (listOfNote.isNotEmpty()) {
                        _noteList.value = listOfNote
                    }
                }
        }
    }

     fun addNote(note: Note) {
        viewModelScope.launch {
            repository.addNote(note)
        }
    }

     fun removeNote(note: Note) {
        viewModelScope.launch {
            repository.deleteNote(note)
        }
    }
}
