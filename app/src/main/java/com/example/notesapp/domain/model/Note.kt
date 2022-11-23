package com.example.notesapp.domain.model

data class Note(
    val id: Int,
    val title: String,
    val description: String,
    val createAt: Long
)