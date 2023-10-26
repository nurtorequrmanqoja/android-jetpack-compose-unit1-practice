package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(title1 = getString(R.string.title_1), text1 = getString(R.string.text_1))
                }
            }
        }
    }
}

@Composable
fun Greeting(title1: String, text1:String, modifier: Modifier = Modifier) {
    Column {
        Row {
            Quadrant(
                title = stringResource(id = R.string.title_1),
                text = stringResource(id = R.string.text_1),
                backgroundColor = Color(0xFFEADDFF)
            )
            Quadrant(
                title = stringResource(id = R.string.title_1),
                text = stringResource(id = R.string.text_1),
                backgroundColor = Color(0xFFEADDFF)
            )
        }
        Row {
            Quadrant(
                title = stringResource(id = R.string.title_1),
                text = stringResource(id = R.string.text_1),
                backgroundColor = Color(0xFFEADDFF)
            )
            Quadrant(
                title = stringResource(id = R.string.title_1),
                text = stringResource(id = R.string.text_1),
                backgroundColor = Color(0xFFEADDFF)
            )
        }
    }

}
@Composable
fun Quadrant(title: String, text: String, backgroundColor: Color, modifier : Modifier = Modifier){
    Column(
        modifier = modifier.background(backgroundColor)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(16.dp)
                .fillMaxSize()


        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(bottom = 16.dp)
            )
            Text(
                text = text,
                textAlign = TextAlign.Justify,
                modifier = modifier

            )
        }

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Greeting(stringResource(id = R.string.title_1), stringResource(id = R.string.text_1))
    }
}