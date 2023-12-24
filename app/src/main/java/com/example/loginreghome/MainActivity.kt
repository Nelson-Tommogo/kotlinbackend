package com.example.loginreghome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.loginreghome.ui.theme.LoginRegHomeTheme
import registration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                registration(NavHostController())
            }
            }
        }
    }




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginRegHomeTheme {
    }
}