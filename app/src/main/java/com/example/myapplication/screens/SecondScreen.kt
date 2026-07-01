package com.example.myapplication.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.myapplication.repository.DataRepository
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage


@Composable
fun SecondScreen(navHostController: NavHostController) {
    var text by remember { mutableStateOf("") }
    var filteredList by remember { mutableStateOf(DataRepository.filmsList) }
    var isEmptyResult by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(48.dp)
    ) {

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Фильтр (год)") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {

                val input = text.toIntOrNull()

                filteredList = if (input != null) {
                    DataRepository.filmsList.filter {
                        it.releaseDate <= input
                    }
                } else {
                    DataRepository.filmsList
                }

                isEmptyResult = filteredList.isEmpty()

            }
        ) {
            Text("Сортировать")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (isEmptyResult) {
            Text("Ничего не найдено")
        } else {

            LazyColumn {
                items(filteredList) { film ->

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {

                        AsyncImage(
                            model = film.imageUrl,
                            contentDescription = null,
                            modifier = Modifier
                                .size(60.dp)
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Column() {
                            Text(film.name,
                                fontSize = TextUnit(16f, TextUnitType.Sp)
                            )
                            Text(film.description.toString())
                            Text(film.releaseDate.toString())
                        }




                    }
                }
            }
        }
    }
}