package com.example.hw2_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hw2_1.ui.theme.Hw2_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hw2_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    threeColorCards(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun colorCard(
    color: Color,
    label: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            color = Color.White,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun threeColorCards(modifier: Modifier = Modifier) {
    val shape = RoundedCornerShape(16.dp)

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        colorCard(
            color = Color(0xFFE57373),
            label = "Red",
            modifier = Modifier
                .padding(4.dp)
                .size(140.dp)
                .background(Color(0xFFE57373), shape)
                .border(2.dp, Color(0xFFB71C1C), shape)
        )

        colorCard(
            color = Color(0xFF81C784),
            label = "Green",
            modifier = Modifier
                .padding(8.dp)
                .size(width = 220.dp, height = 100.dp)
                .border(3.dp, Color(0xFF1B5E20), shape)
                .background(Color(0xFF81C784), shape)
        )

        colorCard(
            color = Color(0xFF64B5F6),
            label = "Blue",
            modifier = Modifier
                .size(160.dp)
                .border(1.dp, Color(0xFF0D47A1), shape)
                .background(Color(0xFF64B5F6), shape)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewThreeColorCards() {
    Hw2_1Theme {
        Surface {
            threeColorCards(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            )
        }
    }
}