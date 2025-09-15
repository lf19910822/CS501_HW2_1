package com.example.colorcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.colorcard.ui.theme.ColorCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorCardAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColorCardScreen()
                }
            }
        }
    }
}

@Composable
fun ColorCard(color: Color, label: String) {
    // Using modifiers: padding, background, border, size
    Box(
        modifier = Modifier
            .size(width = 200.dp, height = 150.dp)  // size modifier
            .padding(16.dp)  // padding modifier
            .background(color, RoundedCornerShape(12.dp))  // background modifier
            .border(3.dp, Color.Black, RoundedCornerShape(12.dp)),  // border modifier
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ColorCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "ColorCard Demo",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        // First card: Red - Using all four modifiers in combination 1
        ColorCard(color = Color.Red, label = "Red Card")
        
        // Second card: Blue - Using modifiers in combination 2 (different values)
        Box(
            modifier = Modifier
                .size(width = 180.dp, height = 120.dp)  // size modifier (different dimensions)
                .background(Color.Blue, RoundedCornerShape(8.dp))  // background modifier
                .border(4.dp, Color.White, RoundedCornerShape(8.dp))  // border modifier (different color/width)
                .padding(12.dp),  // padding modifier (different value)
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Blue Card",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
        
        // Third card: Green - Using modifiers in combination 3 (yet another arrangement)
        Box(
            modifier = Modifier
                .padding(24.dp)  // padding modifier (applied first)
                .size(width = 220.dp, height = 140.dp)  // size modifier 
                .border(2.dp, Color.Yellow, RoundedCornerShape(16.dp))  // border modifier
                .background(Color.Green, RoundedCornerShape(16.dp)),  // background modifier
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Green Card",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColorCardPreview() {
    ColorCardAppTheme {
        ColorCardScreen()
    }
}