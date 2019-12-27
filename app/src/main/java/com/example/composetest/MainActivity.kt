package com.example.composetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.MaterialTypography
import androidx.ui.material.surface.Card
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {

    val image = +imageResource(R.drawable.header)

    MaterialTheme {
        val typography = MaterialTypography()

        Card(shape = RoundedCornerShape(8.dp)) {
            Column(modifier = Spacing(16.dp)) {
                Container(height = 180.dp, expanded = true) {
                    Clip(shape = RoundedCornerShape(8.dp)) {
                        DrawImage(image)
                    }
                }

                HeightSpacer(height = 16.dp)

                Text(text = "Hello world!", style = typography.h6.withOpacity(0.87f))
                Greeting("Compose is cool")
            }
        }
    }
}

@Composable
fun Greeting( message: String = "Hello world!" ) {
    Text( text = message )
}


@Preview
@Composable
fun defaultPreview() {
    MainScreen()
}