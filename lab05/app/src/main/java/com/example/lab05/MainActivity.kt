package com.example.lab05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lab05.ui.theme.ManagementStudyingProgressTheme
import com.example.lab05.ui.navigation.NavigationGraph


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