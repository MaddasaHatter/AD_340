package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diceroller.ui.theme.DicerollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DicerollerTheme {
                DiceRollerApp()
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage()
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)
) {
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.d_1
        2 -> R.drawable.d_2
        3 -> R.drawable.d_3
        4 -> R.drawable.d_4
        5 -> R.drawable.d_5
        6 -> R.drawable.d_6
        7 -> R.drawable.d_7
        8 -> R.drawable.d_8
        9 -> R.drawable.d_9
        10 -> R.drawable.d_10
        11 -> R.drawable.d_11
        12 -> R.drawable.d_12
        13 -> R.drawable.d_13
        14 -> R.drawable.d_14
        15 -> R.drawable.d_15
        16 -> R.drawable.d_16
        17 -> R.drawable.d_17
        18 -> R.drawable.d_18
        19 -> R.drawable.d_19
        else -> R.drawable.d_20
    }

    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = result.toString()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..20).random() }) {
            Text(stringResource(R.string.roll))
        }
        }
    }
}