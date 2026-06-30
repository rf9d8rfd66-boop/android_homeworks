package com.example.myapplication.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import kotlin.random.Random


@Composable
fun GuessNumberScreen() {

    val secretNumber = remember { Random.nextInt(0, 101) }

    var userInput by remember {
        mutableStateOf("")
    }

    var message by remember {
        mutableStateOf("Введите число")
    }

    var isWin by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.padding(start =24.dp, top = 120.dp)
    ) {

        if (isWin) {

            AsyncImage(
                modifier = Modifier.width(350.dp),
                model = "https://i.cdn01.ru/files/users/images/46/06/460612c99ec3e7ad1c16060eadedd270.png",
                contentDescription = "Победа"
            )

        } else {

            Text(
                text = message,
                fontSize = TextUnit(24f, TextUnitType.Sp)
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = userInput,
            onValueChange = {
                userInput = it
            },
            label = {
                Text("Введите число")
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

                val number = userInput.toIntOrNull()

                if (number == null) {
                    message = "Введите число!"
                } else if (number !in 0..100) {
                    message = "Введите число от 0 до 100"
                } else if (number < secretNumber) {
                    message = "Введенное число меньше загаданного"
                } else if (number > secretNumber) {
                    message = "Введенное число больше загаданного"
                } else {
                    isWin = true
                }

            },
            modifier = Modifier
                .height(50.dp)
        ) {

            Text(text= "Проверить",
                fontSize = TextUnit(20f, TextUnitType.Sp))

        }

    }

}