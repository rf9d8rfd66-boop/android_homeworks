package com.example.myapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.myapplication.model.UserDataModel
import com.example.myapplication.ui.BoxSample
import com.example.myapplication.ui.Greeting
import com.example.myapplication.ui.GuessNumberScreen
import com.example.myapplication.ui.UserCard


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        doFirstHomework()

//        val userDataSample = UserDataModel(
//            imageUrl = "https://avatars.mds.yandex.net/i?id=65aeedad98c91159cf920bf8740c520fa2b60467-16490900-images-thumbs&n=13",
//            userName = "Android",
//            lastSeen = "14 minute ago"
//        )


        setContent {
            GuessNumberScreen()


//            UserCard(userData = userDataSample)
        }
    }
}









fun analyzeList(input: List<Int>) {
    val min = input.minOrNull()
    val max = input.maxOrNull()
    val sum = input.sum()

    val evenCount = input.count { it % 2 == 0 }
    val oddCount = input.count { it % 2 != 0 }

    println("Минимальное: $min")
    println("Максимальное: $max")
    println("Сумма: $sum")
    println("Четных: $evenCount")
    println("Нечетных: $oddCount")
}






fun doFirstHomework() {
    analyzeList(listOf(67, -14, 22, -8, 15, 69, -37))
    checkPassword("someTestPassword")
}


fun checkPassword(password: String) {

    var score = 0

    if (password.length >= 8) score++
    if (password.any { it.isDigit() }) score++
    if (password.any { it.isUpperCase() }) score++
    if (password.any { it.isLowerCase() }) score++
    if (password.any { !it.isLetterOrDigit() }) score++

    val result = when (score) {
        5 -> "Надежный пароль"
        4 -> "Хороший пароль"
        2, 3 -> "Средний пароль"
        else -> "Ненадежный пароль"
    }

    println("Надежность пароля: $result")
}






