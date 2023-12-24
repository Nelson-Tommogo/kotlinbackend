//package com.example.harvesthq.navigation
//
//import Register
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//
//sealed class Screen(val route: String) {
//    object SignUp : Screen("signup")
//    object LogIn : Screen("login")
//    object Reset : Screen("resetpassword")
//    object Home : Screen("BottomNavBar")
//}
//
//@Composable
//fun SetupNavigation(navController: NavHostController) {
//    androidx.navigation.compose.NavHost(
//        navController = navController,
//        startDestination = Screen.SignUp.route
//    ) {
//        composable(Screen.SignUp.route) {
//            Register(navController = navController) { firstName, lastName, email, password ->
//                // Handle signup logic
//            }
//        }
//
//        // Add composable functions for other screens if needed
//    }
//}
