package com.example.lab03.ui.screens.placeDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab03.R
import com.example.lab03.data.ItemsData

@Composable
fun PlaceDetailsScreen(id: Int) {
    // Retrieve the item based on the provided id
    val item = ItemsData.itemList.first { it.id == id }

    Column(
        modifier = Modifier
            .background(Color(0xFFC5B5FA))
            .fillMaxSize()
    ) {
        // Use a LazyColumn for scrollable content
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                // Заголовок місця з номером
                Text(
                    text = "${item.id}. ${item.title}",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            item {
                // Вибір зображення залежно від місця
                val imageID = when (item.image) {
                    "great_wall" -> R.drawable.great_wall
                    "machu_picchu" -> R.drawable.machu_picchu
                    "chichen_itza" -> R.drawable.chichen_itza
                    "colosseum" -> R.drawable.colosseum
                    "taj_mahal" -> R.drawable.taj_mahal
                    "christ_the_redeemer" -> R.drawable.christ_the_redeemer
                    "pyramids_of_giza" -> R.drawable.pyramids_of_giza
                    else -> R.drawable.great_wall
                }
                Image(
                    painter = painterResource(id = imageID),
                    contentDescription = item.title,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            item {
                // Опис місця
                Text(
                    text = item.description,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}
