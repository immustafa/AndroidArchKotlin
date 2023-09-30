package com.imgego.androidarchkotlin.compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.imgego.androidarchkotlin.ui.theme.AndroidArchKotlinTheme


@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Profile Screen",
            color = Color.Black,
            fontSize = 40.sp,
            textAlign = TextAlign.Center
        )
    }

}


@Composable
@Preview
fun ProfileScreenPreview() {
    AndroidArchKotlinTheme {
        ProfileScreen()
    }
}