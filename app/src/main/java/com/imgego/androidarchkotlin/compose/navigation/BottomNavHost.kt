package com.imgego.androidarchkotlin.compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.imgego.androidarchkotlin.compose.screens.ArtworksScreen
import com.imgego.androidarchkotlin.compose.screens.HomeScreen
import com.imgego.androidarchkotlin.compose.screens.ProfileScreen

@Composable
fun BottomNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavScreen.Artworks.route
    ) {
        composable(route = BottomNavScreen.Home.route) {
            HomeScreen()
        }

        composable(route = BottomNavScreen.Artworks.route) {
            ArtworksScreen()
        }

        composable(route = BottomNavScreen.Profile.route) {
            ProfileScreen()
        }
    }
}