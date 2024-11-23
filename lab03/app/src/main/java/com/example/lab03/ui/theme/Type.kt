package com.example.lab03.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Заміна на сучасні шрифти
val Typography = Typography(
    // Шрифт для основного тексту
    bodyLarge = TextStyle(
        fontFamily = FontFamily.SansSerif, // Можна замінити на конкретний шрифт, наприклад, Poppins
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp, // Збільшення розміру для комфортного читання
        lineHeight = 28.sp, // Лінійна висота для кращого сприйняття тексту
        letterSpacing = 0.15.sp // Міжлітерний інтервал для кращої читаємості
    ),

    // Стиль для заголовків
    titleLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold, // Заголовки будуть жирними
        fontSize = 26.sp, // Більший розмір для заголовків
        lineHeight = 32.sp, // Вища лінійна висота для заголовків
        letterSpacing = 0.sp
    ),

    // Стиль для підзаголовків
    titleMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold, // Напівжирний шрифт для підзаголовків
        fontSize = 22.sp, // Розмір для підзаголовків
        lineHeight = 28.sp,
        letterSpacing = 0.1.sp
    ),

    // Стиль для підписів
    labelSmall = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium, // Для підписів середня жирність
        fontSize = 14.sp, // Трошки менший розмір для підписів
        lineHeight = 20.sp, // Лінійна висота для підписів
        letterSpacing = 0.2.sp
    )
)
