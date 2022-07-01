package com.sodhan.jetpacklearning

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sodhan.jetpacklearning.ui.theme.JetpackLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackLearningTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android", "Test Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, body: String) {
    Row {
        Column() {
           Image(
               painter = painterResource(R.drawable.flower),
               contentDescription = "Flower Image",
               modifier = Modifier
                   // Set image size to 40 dp
                   .size(40.dp)
                   // Clip image to be shaped as a circle
                   .clip(CircleShape)
                   .border(1.5.dp,MaterialTheme.colors.secondary, CircleShape)
           )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = "Hello $name!",
                color= MaterialTheme.colors.secondaryVariant,
                style= MaterialTheme.typography.h5


            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = body,
                style= MaterialTheme.typography.subtitle1
            )
        }
        Spacer(modifier = Modifier.width(8.dp))

    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Preview(showBackground = false)
@Preview(showBackground = true)
@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    JetpackLearningTheme {
        Column() {
            Greeting("Android", "Test Android")
            Greeting("Android", "Test Android")
            Greeting("Android", "Test Android")
        }

    }
}