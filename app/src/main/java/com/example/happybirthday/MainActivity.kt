package com.example.happybirthday

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage("Happy", "Birthday!!!", "-Sean")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message1: String, message2: String, from: String) {
    Surface(color = Color.DarkGray) {
        Column(modifier = Modifier.padding(100.dp)) {
            Text(
                text = message1,
                fontSize = 18.sp,
                color = Color.Green
            )
            Text(
                text = message2,
                fontSize = 24.sp,
                color = Color.Magenta
            )
            Text(
                text = from,
                fontSize = 12.sp,
                modifier = Modifier.padding(10.dp),
                color = Color.Red
            )
        }
    }
}

@Composable
fun BirthdayGreetingWithImage(message1: String, message2: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithText("Happy", "Birthday!!!", "-Sean")
    }
}