package com.example.notesapp.domain.usecase

import com.example.notesapp.domain.model.Note
import com.example.notesapp.domain.repository.NoteRepository

class EditNoteUseCase(private val noteRepository: NoteRepository) {

    fun editNote(note: Note) = noteRepository.editNote(note)
}