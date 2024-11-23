package com.example.lab03.ui.screens.placesList

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab03.data.ItemsData

@Composable
fun PlacesListScreen(
    onDetailsScreen: (Int) -> Unit
) {

    val itemListState = remember { mutableStateOf(ItemsData.itemList) }

    // Основна колонка для заголовку і списку
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF9C77EC)) // Легкий фон
            .padding(horizontal = 16.dp) // Відступи по боках
    ) {
        // Заголовок "7 Чудес світу"
        Text(
            text = "7 Чудес світу",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4E4B47),
            modifier = Modifier
                .padding(top = 24.dp)
        )

        // Список чудес світу
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp)
        ) {
            items(itemListState.value) { item ->
                // Картка для кожного місця
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .border(
                            width = 1.dp,
                            color = Color(0xFF00D9F5),
                            shape = RoundedCornerShape(24.dp) // Округлені краї
                        )
                        .background(
                            Color(0xFF04C5E0), // М'який фон картки
                            shape = RoundedCornerShape(16.dp)
                        )
                        .clickable {
                            onDetailsScreen(item.id)
                        }
                ) {
                    // Назва місця
                    Text(
                        text = item.title,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF4E4B47), // Темно-сірий для тексту
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PlacesListScreenPreview() {
    PlacesListScreen(onDetailsScreen = {})
}
