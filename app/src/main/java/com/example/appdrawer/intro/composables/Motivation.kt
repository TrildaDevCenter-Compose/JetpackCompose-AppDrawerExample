package com.example.appdrawer.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appdrawer.app.ui.previews.AllScreenPreview
import com.example.appdrawer.app.ui.theme.AppDrawerExampleTheme
import com.example.appdrawer.intro.IntroNavOption


@Composable
fun MotivationScreen(navController: NavController) = IntroCompose(
    navController = navController,
    text = "Motivation"
) {
    navController.navigate(IntroNavOption.RecommendationScreen.name)
}

@AllScreenPreview
@Composable
fun MotivationPrivacyPreview() {
    val navController = rememberNavController()
    AppDrawerExampleTheme {
        MotivationScreen(navController = navController)
    }
}

