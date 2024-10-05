package com.example.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun Task6(modifier: Modifier = Modifier){
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val squareSize = screenWidth.div(3f)
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier.fillMaxSize()
    ){
        Box(modifier = Modifier
            .size(squareSize)
            .background(color = Color.Black),
            contentAlignment = Alignment.Center
        ){
            Text("Простой", color = Color.White)
        }
        Box(modifier = Modifier
            .rotate(60f)
            .scale(0.5f,1f)
            .size(squareSize)
            .background(color = Color.Black),
            contentAlignment = Alignment.Center
        ){
            Text("Повернутый", color = Color.White)
        }
    }
}