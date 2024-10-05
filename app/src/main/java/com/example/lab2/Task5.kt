package com.example.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun Task5(modifier: Modifier = Modifier){
    val colors = listOf(Color.Red, Color.Green, Color.Blue, Color.Magenta, Color.Unspecified, Color.Black)
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val squareSize = screenWidth.div(3f)
    val spacing = 20.dp
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalArrangement = Arrangement.spacedBy(spacing)
    ) {
        items(colors) { color ->
            Box(modifier = Modifier
                .size(squareSize + spacing/2)
                .padding(top = spacing)
                .background(color = color)
            )
        }
    }
}