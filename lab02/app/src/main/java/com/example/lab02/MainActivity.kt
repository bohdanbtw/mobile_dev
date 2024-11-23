package com.example.lab02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab02.ui.theme.Lab02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab02Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ToDoScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ToDoScreen(modifier: Modifier = Modifier) {
    // Correctly initialize mutableStateOf without using 'by'
    val taskName = remember { mutableStateOf("") }
    val taskList = remember { mutableStateListOf<String>() }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // TextField to input task name
        TextField(
            value = taskName.value,
            onValueChange = { taskName.value = it },
            label = { Text("Enter task") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Button to add task
        Button(
            onClick = {
                if (taskName.value.isNotBlank()) {
                    taskList.add(taskName.value)
                    taskName.value = "" // Clear text field after adding
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Add Task")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Displaying the list of tasks
        Text(text = "Tasks:", modifier = Modifier.padding(bottom = 8.dp))
        taskList.forEachIndexed { index, task ->
            Text(
                text = "${index + 1}. $task",
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Lab02Theme {
        ToDoScreen()
    }
}
