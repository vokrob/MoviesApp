package com.vokrob.moviesapp.Activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vokrob.moviesapp.BottomNavigationBar
import com.vokrob.moviesapp.Domain.FilmItemModel
import com.vokrob.moviesapp.R
import com.vokrob.moviesapp.SearchBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {}
    }
}

@Preview
@Composable
fun MainScreen(onItemClick: (FilmItemModel) -> Unit = {}) {
    Scaffold(
        bottomBar = { BottomNavigationBar() },
        floatingActionButton = {
            Box(
                Modifier
                    .size(60.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                colorResource(R.color.pink),
                                colorResource(R.color.green)
                            )
                        ),
                        shape = CircleShape
                    )
                    .padding(3.dp)
            ) {
                FloatingActionButton(
                    onClick = {},
                    backgroundColor = colorResource(R.color.black3),
                    modifier = Modifier.size(58.dp),
                    contentColor = Color.White,
                    content = {
                        Icon(
                            painter = painterResource(R.drawable.float_icon),
                            contentDescription = null,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                )
            }
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center,
        backgroundColor = colorResource(R.color.blackBackground)
    )
    { paddingValues ->
        Box(
            Modifier
                .padding(paddingValues)
                .background(colorResource(R.color.blackBackground))
        ) {
            Image(
                painter = painterResource(R.drawable.bg1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )
        }

        MainContent(onItemClick)
    }
}

@Composable
fun MainContent(onItemClick: (FilmItemModel) -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(
                top = 60.dp,
                bottom = 100.dp
            )
    ) {
        Text(
            text = "What would you like to watch?",
            style = TextStyle(
                color = Color.White,
                fontSize = 25.sp
            ),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(
                    start = 16.dp,
                    bottom = 16.dp
                )
                .fillMaxWidth()
        )

        SearchBar("Search Movies...")
    }
}






















