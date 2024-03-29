package com.stu71205.thursday1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stu71205.thursday1.ui.theme.Thursday1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            @Composable
            fun boxYellow(num: Int){
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .background(Color.Yellow)
                )
                {
                    Text(text = "Box $num", fontSize = 20.sp)
                }
            }

            @Composable
            fun boxRed(num: Int){
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .background(Color.Red)
                )
                {
                    Text(text = "Box $num", fontSize = 20.sp)
                }
            }

            Column {

                for (i in 1..4){

                    if (i % 2 == 0){
                        Row {
                            for (num in 1..4){

                                if (num % 2 == 0){
                                    boxYellow(num)
                                } else {
                                    boxRed(num)
                                }
                            }
                        }
                    } else {
                        Row {
                            for (num in 1..4){

                                if (num % 2 == 0){
                                    boxRed(num)
                                } else {
                                    boxYellow(num)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Thursday1Theme {
        Greeting("Android")
    }
}
}