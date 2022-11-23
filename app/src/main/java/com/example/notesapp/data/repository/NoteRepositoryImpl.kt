package com.example.notesapp.data.repository

import com.example.notesapp.data.localdb.NoteDao
import com.example.notesapp.data.mapper.toEntity
import com.example.notesapp.data.mapper.toNote
import com.example.notesapp.domain.model.Note
import com.example.notesapp.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {

    override fun createNote(note: Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map { it.toNote() }
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toEntity())
    }
}