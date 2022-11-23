package com.example.notesapp.domain.usecase

import com.example.notesapp.domain.repository.NoteRepository

class GetAllNotesUseCase(private val noteRepository: NoteRepository) {

    fun getAllNotes() = noteRepository.getAllNotes()
}