package com.example.notesapp.domain.repository

import com.example.notesapp.domain.model.Note

interface NoteRepository {

    fun createNote(note: Note)

    fun getAllNotes(): List<Note>

    fun editNote(note: Note)

    fun deleteNote(note: Note)
}