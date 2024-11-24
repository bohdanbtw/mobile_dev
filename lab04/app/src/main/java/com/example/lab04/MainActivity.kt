package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lab04.ui.theme.ManagementStudyingProgressTheme
import com.example.lab04.ui.navigation.NavigationGraph


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManagementStudyingProgressTheme {
                NavigationGraph()
            }
        }
    }
}