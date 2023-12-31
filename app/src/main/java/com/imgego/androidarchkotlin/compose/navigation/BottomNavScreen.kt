package com.imgego.androidarchkotlin.compose.navigation


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Photo
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Photo
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomNavScreen(
    val route: String,
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasBadge: Boolean,
    val badgeCount: Int? = null
) {

    // for home
    object Home : BottomNavScreen(
        route = "home",
        title = "Home",
        selectedIcon = Icons.Rounded.Home,
        unselectedIcon = Icons.Outlined.Home,
        hasBadge = true,
        badgeCount = 4
    )

    // for artworks
    object Artworks : BottomNavScreen(
        route = "artworks",
        title = "Artworks",
        selectedIcon = Icons.Rounded.Photo,
        unselectedIcon = Icons.Outlined.Photo,
        hasBadge = false
    )

    // for profile
    object Profile : BottomNavScreen(
        route = "profile",
        title = "Profile",
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        hasBadge = false
    )

}
