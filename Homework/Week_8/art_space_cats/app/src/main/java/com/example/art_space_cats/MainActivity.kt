package com.example.art_space_cats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.art_space_cats.ui.theme.Art_space_catsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Art_space_catsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CatGallery()
                }
            }
        }
    }
}
//R.drawable.dice_1
@Composable
fun CatGalleryButtonsAndImages(modifier: Modifier = Modifier)  {

    var result by remember { mutableStateOf(1) }

    val imageResource = when (result) {
        1 -> R.drawable.ahhh_cat
        2 -> R.drawable.all_cats
        3 -> R.drawable.baby_cat
        4 -> R.drawable.boba_cat
        5 -> R.drawable.cat_warhol
        6 -> R.drawable.cute_cat
        7 -> R.drawable.cute_pair
        else -> R.drawable.nom_cat
    }

    val textResource = when (result) {
        1 -> "A Sweet Kitty Lounges in a Tea Cup"
        2 -> "A Group of Kitties Play"
        3 -> "A Sweet Kitten Wear a Tiger Hat"
        4 -> "A Cute Kitty Drinks Some Boba Tea"
        5 -> "The Andy Warhol of Kitties"
        6 -> "An Innocent Kitty Eats Snacks"
        7 -> "A Lovely Couple of Sweet Kitties"
        else -> "The Silly Kittie and The Happy Snack"
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(id = imageResource),
            contentDescription = result.toString(),
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = textResource
        )
        Row(
            modifier = modifier) {
            Button(onClick = {
                if (result >= 2) {
                    result -= 1
                }
            }) {
                Text(text = stringResource(R.string.previous))
            }
            Button(onClick = {
                if (result <= 7) {
                    result += 1
                }
            }) {
                Text(text = stringResource(R.string.next))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CatGallery() {
    CatGalleryButtonsAndImages()
}