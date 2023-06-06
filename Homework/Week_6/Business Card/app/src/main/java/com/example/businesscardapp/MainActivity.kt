package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinesscardappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardappTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(name= "Lilith Caldwell", from= "me")
                    Links(phone= "(206)999-9999", social= "github.com/lilithC", email= "lilithcaldwell.student@gmail.com")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "$name",
            fontSize = 69.sp,
            modifier = Modifier
                .padding(top = 160.dp)
        )
        Text(
            text = from,
            fontSize = 26.sp,
            modifier = Modifier
                .padding(top= 10.dp)
        )
    }
}

@Composable
fun Links(phone: String, social: String, email: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = phone,
            fontSize = 27.sp,
            modifier = Modifier
                .padding(top= 500.dp)
        )
        Text(
            text = social,
            fontSize = 27.sp,
            modifier = Modifier
                .padding(top= 20.dp)
        )
        Text(
            text = email,
            fontSize = 27.sp,
            modifier = Modifier
                .padding(top= 20.dp)
        )
    }
}

@Composable
fun GreetingImage(name: String, from: String, phone: String, social: String, email: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.nsc)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .align(alignment = Alignment.TopCenter)
                .padding(top = 80.dp)
        )
        Greeting(
            name = name,
            from = from,
        )
        Links(
            phone = phone,
            social = social,
            email = email,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BusinesscardappTheme() {
        GreetingImage(name="Lilith Caldwell", from="Application Development Student", phone= "(206)999-9999", social = "github.com/", email = "taylorpapke.student@gmail.com")
    }
}