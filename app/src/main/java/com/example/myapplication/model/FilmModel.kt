package com.example.myapplication.model

data class FilmModel(
    val id: String,
    val imageUrl: String,
    val name: String,
    val description: String?,
    val releaseDate: Int
)