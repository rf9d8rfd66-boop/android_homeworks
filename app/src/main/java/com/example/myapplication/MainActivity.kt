package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        analyzeList(listOf(67, -14, 22, -8, 15, 69, -37))
        checkPassword("someTestPassword")
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

