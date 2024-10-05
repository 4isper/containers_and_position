package com.example.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun Task2and3(modifier: Modifier = Modifier){
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val squareSize = screenWidth.div(2.5f)

    ConstraintLayout(
        modifier = modifier.fillMaxSize()
    ){
        val (box1, box2, box3) = createRefs()

        Box(modifier = Modifier
            .size(squareSize)
            .background(color = Color.Red)
            .constrainAs(box1){
                centerVerticallyTo(parent)
            }
        )
        Box(modifier = Modifier
            .size(squareSize)
            .background(color = Color.Green)
            .constrainAs(box2) {
                start.linkTo(box1.end)
                top.linkTo(box1.top,margin = squareSize/2)
            }
        )
        Box(modifier = Modifier
            .size(squareSize)
            .background(color = Color.Blue)
            .constrainAs(box3){
              top.linkTo(box1.top)
              start.linkTo(box1.end, margin = squareSize/2)
            },
            contentAlignment = Alignment.Center
        ){
            Text("Квадрат", color = Color.White, fontSize = 26.sp)
        }
    }
}