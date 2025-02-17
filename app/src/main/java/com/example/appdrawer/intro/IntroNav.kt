package com.example.appdrawer.intro

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.appdrawer.NavRoutes
import com.example.appdrawer.intro.composables.MotivationScreen
import com.example.appdrawer.intro.composables.RecommendationScreen
import com.example.appdrawer.intro.composables.WelcomeScreen

fun NavGraphBuilder.introGraph(navController: NavController) {
    navigation(startDestination = IntroNavOption.WelcomeScreen.name, route = NavRoutes.IntroRoute.name) {
        composable(IntroNavOption.WelcomeScreen.name){
            WelcomeScreen(navController)
        }
        composable(IntroNavOption.MotivationScreen.name){
            MotivationScreen(navController)
        }
        composable(IntroNavOption.RecommendationScreen.name){
            RecommendationScreen(navController)
        }
    }
}

enum class IntroNavOption {
    WelcomeScreen,
    MotivationScreen,
    RecommendationScreen
}
