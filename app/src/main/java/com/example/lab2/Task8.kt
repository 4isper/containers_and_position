package com.example.lab2

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.GraphicsContext
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
fun Task8(modifier: Modifier = Modifier){
    var showDialog by remember { mutableStateOf(true) }
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
//    val snackbarHostState = remember { SnackbarHostState() }
//    val scope = rememberCoroutineScope()
//    val context = LocalContext.current
    var count by remember { mutableStateOf(0.0) }

    if (showDialog) {
        AlertDialog(
            modifier = modifier,
            onDismissRequest = { showDialog = false },
            confirmButton = {
                Button(onClick = {
                    val number1 = num1.toDoubleOrNull() ?: 0.0
                    val number2 = num2.toDoubleOrNull() ?: 0.0
                    count = number1 + number2
                    Log.i("Summa", "$count")
//                    scope.launch {
//                        snackbarHostState.showSnackbar("Сумма: $sum")
//                    }
                    //Toast.makeText(context, "Сумма: $sum" ,Toast.LENGTH_SHORT).show()
                }) {
                    Text("Подтвердить")
                }
            },
            dismissButton = {
                Button(onClick = { showDialog = false }) {
                    Text("Отмена")
                }
            },
            title = { Text("Введите числа") },
            text = {
                Column {
                    OutlinedTextField(
                        value = num1,
                        onValueChange = { newValue ->
                            if (newValue.toDoubleOrNull() != null) {
                                num1 = newValue
                            }},
                        label = { Text("Число 1") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("+")
                    OutlinedTextField(
                        value = num2,
                        onValueChange = { newValue ->
                            if (newValue.toDoubleOrNull() != null) {
                                num2 = newValue
                            }},
                        label = { Text("Число 2") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
//                    Spacer(modifier = Modifier.height(16.dp))
                    Text("= ${count}")
                }
            }
        )
    }
//
//    SnackbarHost(
//        hostState = snackbarHostState,
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(26.dp)
//    )
}