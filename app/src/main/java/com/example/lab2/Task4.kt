package com.example.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun Task4(modifier: Modifier = Modifier){
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val squareSize = screenWidth.div(3f)
    val spacing = 20.dp
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(spacing),
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(spacing)
        ){
            Box(modifier = Modifier
                .size(squareSize - spacing/2)
                .background(color = Color.Red)
            )
            Box(modifier = Modifier
                .size(squareSize - spacing/2)
                .background(color = Color.Magenta)
            )
        }
        Column (verticalArrangement = Arrangement.spacedBy(spacing)){
            Box(modifier = Modifier
                .size(squareSize - spacing/2)
                .background(color = Color.Green)
            )
            Box (modifier = Modifier
                .size(squareSize - spacing/2)
            )
        }
        Column (verticalArrangement = Arrangement.spacedBy(spacing)){
            Box(modifier = Modifier
                .size(squareSize - spacing/2)
                .background(color = Color.Blue)
            )
            Box(modifier = Modifier
                .size(squareSize - spacing/2)
                .background(color = Color.Black)
            )
        }
    }
}