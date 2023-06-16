package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting(message= "Happy Birthday, Moon",from = "From MOU")
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String,from: String ,modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) {
        Column (
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                ){
            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 110.sp,
                textAlign = TextAlign.Center
            )

        }
        Column (verticalArrangement = Arrangement.Bottom,
        modifier = modifier.padding(10.dp)){
            Text(
                text = from,
                textDecoration = TextDecoration.Underline,
                fontSize = 30.sp,
                modifier = modifier
                    .align(alignment = Alignment.End)

            )
        }

    }
}

@Preview(showBackground = true,
        showSystemUi = true)
@Composable
fun BirthDayCardPreview() {
    JetpackComposeTheme {
        Greeting(message= "Happy Birthday, Moon",from = "From MOU")
    }
}