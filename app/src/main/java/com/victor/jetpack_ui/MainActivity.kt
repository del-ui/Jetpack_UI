package com.victor.jetpack_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.victor.jetpack_ui.ui.theme.Jetpack_UITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_UITheme {

                SignInScreen()

            }
        }
    }
}

@Composable
fun SignInScreen(){
    Scaffold(backgroundColor = MaterialTheme.colors.primary) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top) {
            Image(
                painter = painterResource(id = R.drawable.ic_visa),
                contentDescription = "App Logo",
                modifier = Modifier.weight(1f),
                colorFilter = ColorFilter.tint(Color.White)
             )
            Card(
                Modifier
                    .weight(2f)
                    .padding(8.dp),
            shape = RoundedCornerShape(32.dp)) {
                Column(
                    Modifier
                    .fillMaxSize()
                    .padding(32.dp)) {

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    }
