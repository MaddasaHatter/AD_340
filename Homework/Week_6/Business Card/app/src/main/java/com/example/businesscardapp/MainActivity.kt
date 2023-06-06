package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
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
            BusinesscardappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(name= "Lilith Caldwell", from= "Application Development",
                    phone= "(206)999-9999", social= "github.com/MaddasaHatter",
                        email= "lilith.caldwell@seattle colleges.com")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String) {
    Column (
        verticalArrangement = Center,
        horizontalAlignment = CenterHorizontally,

    ) {
        Text(
            text = name,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(top = 200.dp)
                .padding(horizontal = 40.dp)
        )
        Text(
            text = from,
            fontSize = 26.sp,
            modifier = Modifier
                .padding(top= 10.dp)
                .padding(horizontal = 40.dp)
        )
    }
}

@Composable
fun Links(phone: String, social: String, email: String) {
    Column (
        verticalArrangement = Center,
        horizontalAlignment = CenterHorizontally,
    ) {
        Text(
            text = phone,
            fontSize = 27.sp,
            modifier = Modifier
                .padding(top= 400.dp)
        )
        Text(
            text = social,
            fontSize = 23.sp,
            modifier = Modifier
                .padding(top= 20.dp)
                .padding(horizontal = 40.dp)
        )
        Text(
            text = email,
            fontSize = 23.sp,
            modifier = Modifier
                .padding(top= 20.dp)
                .padding(horizontal = 40.dp)
        )
    }
}
@Composable
fun GreetingImage(name: String, from: String, phone: String, social: String, email: String,
                  modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .align(alignment = Alignment.Center)

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
fun BusinessCardPreview() {
    BusinesscardappTheme {
        GreetingImage(name="Lilith Caldwell", from="Application Development Student", phone= "(206)999-9999",
            social = "github.com/MaddasaHatter", email = "lilith.caldwell@seattle colleges.com")
    }
}