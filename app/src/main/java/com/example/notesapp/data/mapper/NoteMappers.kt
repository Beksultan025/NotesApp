package com.example.notesapp.data.mapper

import com.example.notesapp.data.model.NoteEntity
import com.example.notesapp.domain.model.Note

fun Note.toEntity() = NoteEntity(
    id, title, description, createAt
)

fun NoteEntity.toNote() = Note(
    id, title, description, createAt
)
