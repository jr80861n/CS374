package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.focus.DefaultFocusProperties.start
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()

            .background(color = Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.joe)

        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(310.dp)
                .width(180.dp)
                .padding(top = 0.dp)
                .padding(bottom = 0.dp)

        )
        Text(
            modifier = Modifier
                .padding(top = 0.dp)
                .padding(bottom = 2.dp),
            text = "Joe Rios",
            color = Color.White,
            fontSize = 32.sp
        )
        Text(
            modifier = Modifier
                .padding(top = 8.dp)
                .padding(bottom = 270.dp),
            text = "Android Developer",
            fontSize = 20.sp,
            color = Color.White

        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 0.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start

    ) {
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color.Blue)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 120.dp)
                .padding(top = 557.dp)





        ) {
            val phone = painterResource(id = R.drawable.phone_icon)
            Image(
                painter = phone,
                contentDescription = null,
                //modifier = Modifier.padding(8.dp)
                modifier = Modifier
                    .heightIn(20.dp, 30.dp)
                    .padding(top = 1.dp)


            )
            Text(
                text = "+1 (631) 747-0571",
                color = Color.White,
                modifier = Modifier
                    .padding(8.dp)

            )//, modifier = Modifier.padding(8.dp))

        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 3.dp, color = Color.Blue)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 120.dp)

        ) {
            val location = painterResource(id = R.drawable.img_location)
            Image(
                painter = location,
                contentDescription = null,
                //modifier = Modifier.padding(8.dp),
                modifier = Modifier
                    .heightIn(20.dp, 30.dp)
            )
            Text(
                text = "Pace University",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )//, modifier = Modifier.padding(8.dp))
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 3.dp, color = Color.Blue)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 120.dp)

        ) {
            val email = painterResource(id = R.drawable.email_icon)
            Image(
                painter = email,
                contentDescription = null,
                //modifier = Modifier.padding(8.dp)
                modifier = Modifier
                    .heightIn(20.dp, 30.dp)
            )
            Text(
                text = "jr80861n@pace.edu",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 3.dp, color = Color.Blue)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 120.dp)

        ) {
            val github = painterResource(id = R.drawable.github_icon_logo)
            Image(
                painter = github,
                contentDescription = null,
                //modifier = Modifier.padding(8.dp)
                modifier = Modifier
                    .heightIn(20.dp, 30.dp)
            )
            Text(
                text = "github.com/jr80861n",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 3.dp, color = Color.Blue)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 120.dp)

        ) {
            val linkedin = painterResource(id = R.drawable.img_linkedin)
            Image(
                painter = linkedin,
                contentDescription = null,
                //modifier = Modifier.padding(8.dp)
                modifier = Modifier
                    .heightIn(20.dp, 30.dp)
            )
            Text(
                text = "linkedin.com/in/joseph-rios-1733a11b7",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }



    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}


