package com.stu71205.thursday1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
            Column() {
                Row {
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Yellow)
                    )
                    {
                        Text(text = "Box 1", fontSize = 20.sp)
                    }

                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Red)
                    )
                    {
                        Text(text = "Box 2", fontSize = 20.sp)
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Yellow)
                    )
                    {
                        Text(text = "Box 3", fontSize = 20.sp)
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Red)
                    )
                    {
                        Text(text = "Box 4", fontSize = 20.sp)
                    }
                }

                Row {
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Red)
                    )
                    {
                        Text(text = "Box 1", fontSize = 20.sp)
                    }

                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Yellow)
                    )
                    {
                        Text(text = "Box 2", fontSize = 20.sp)
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Red)
                    )
                    {
                        Text(text = "Box 3", fontSize = 20.sp)
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Yellow)
                    )
                    {
                        Text(text = "Box 4", fontSize = 20.sp)
                    }
                }

                Row {
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Yellow)
                    )
                    {
                        Text(text = "Box 1", fontSize = 20.sp)
                    }

                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Red)
                    )
                    {
                        Text(text = "Box 2", fontSize = 20.sp)
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Yellow)
                    )
                    {
                        Text(text = "Box 3", fontSize = 20.sp)
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Red)
                    )
                    {
                        Text(text = "Box 4", fontSize = 20.sp)
                    }
                }

                Row {
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Red)
                    )
                    {
                        Text(text = "Box 1", fontSize = 20.sp)
                    }

                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Yellow)
                    )
                    {
                        Text(text = "Box 2", fontSize = 20.sp)
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Red)
                    )
                    {
                        Text(text = "Box 3", fontSize = 20.sp)
                    }
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Yellow)
                    )
                    {
                        Text(text = "Box 4", fontSize = 20.sp)
                    }
                }
                }

//            Thursday1Theme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
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