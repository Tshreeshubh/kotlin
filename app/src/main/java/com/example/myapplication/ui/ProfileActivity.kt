//package com.example.myapplication.ui
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.KeyboardArrowLeft
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.OutlinedButton
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.alpha
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.myapplication.R
//import com.example.myapplication.ui.ui.theme.MyApplicationTheme
//
//class ProfileActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Scaffold { innerPadding ->
//                ProfileBody(innerPadding)
//            }
//
//
//        }}}
//
//@Composable
//fun ProfileBody(innerPadding: PaddingValues ) {
//    Column(
//        modifier = Modifier
//            .padding(innerPadding)
//            .fillMaxSize()
//            .background(color = Color.Green)
//
//
//    ) {
//
//        Row (
//            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//
//
//            Icon(
//                imageVector = Icons.Default.KeyboardArrowLeft,
//                tint = Color.Black,
//                contentDescription = null, modifier = Modifier
//                    .height(28.dp).width(28.dp)
//
//            )
//
//
//
//            Text(
//                text = "AHraat_bhaaar_jaiye_naghar", style = TextStyle(
//                    fontSize = 15.sp,
////                textDecoration = null,
//                    fontWeight = FontWeight.Bold,
////                fontStyle = null,
//                )
//            )
//            Icon(
//                painter = painterResource(R.drawable.baseline_more_horiz_24),
//                tint = Color.Black,
//                contentDescription = null, modifier = Modifier
//                    .height(28.dp)
//                    .width(28.dp)
//
//            )
//
//        }
//        Row(
//            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Image(
//                painter = painterResource(R.drawable.dk),
////                tint = Color.Black,
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//
//                    .height(100.dp)
//                    .width(100.dp)
//                    .clip(shape = androidx.compose.foundation.shape.CircleShape)
//            )
//            Column (
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ){
//                Text(text="174")
//                Text(text="posts")
//            }
//            Column (
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ){
//                Text(text="772k")
//                Text(text="followers")
//
//            }
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text="1")
//                Text(text="following")
//
//            }
//
//
//
//
//    }
//        Column(modifier = Modifier.padding(horizontal = 15.dp, vertical = 15.dp),
//
//
//        ) {
//            Text(text="Dikshanta ", style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold))
//            Text(text="MY LIFE MY CHOICE \uD83C\uDFF3\uFE0F\u200D\uD83C\uDF08 ", style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold))
//            Text(text="Vitti ko majdur", modifier = Modifier.alpha(alpha = 0.5f))
//            Text(text="Dikshanta@g.com ")
//            Text(text="followed by saroj_tamang,nikisha and 69 others")
//
//
//
//        }
//        Row(
//            modifier = Modifier.fillMaxWidth().padding(horizontal = 0.dp, vertical = 0.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.Absolute.SpaceEvenly
//
//
//        ) {
//            Button(onClick = {
//                // TODO when button is clicked
//            }, shape = RoundedCornerShape(10.dp),
//                border = BorderStroke(1.dp, Color.Blue),) {
//                Text(text = "Follow")
//            }
//
//            OutlinedButton(onClick = {
//                // TODO when outlined button is clicked
//            }, shape = RoundedCornerShape(10.dp),
//                border = BorderStroke(1.dp, Color.Black),
//                colors = ButtonDefaults.outlinedButtonColors(
//                    contentColor = Color.Black,
//                )
//
//
//
//
//
//                ) {
//                Text(text = "Message")
//            }
//
//            Button(onClick = {
//                // TODO when button is clicked
//            }, shape = RoundedCornerShape(10.dp),
//                border = BorderStroke(1.dp, Color.Black),
//                colors = ButtonDefaults.outlinedButtonColors(
//                    contentColor = Color.Black,
//                )) {
//                Text(text = "Email")
//            }
//            Button(onClick = {
//                // TODO when button is clicked
//            }, shape = RoundedCornerShape(10.dp),
//                border = BorderStroke(1.dp, Color.Black),
//                colors = ButtonDefaults.outlinedButtonColors(
//                    contentColor = Color.Black,
//                )) {
//                Icon(
//                    painter = painterResource(R.drawable.baseline_more_horiz_24),
//                    tint = Color.Black,
//                    contentDescription = null, modifier = Modifier
//                        .height(28.dp)
//                        .width(28.dp)
//
//                )
//            }
//
//        }}}
//
//@Preview(showBackground = true)
//@Composable
//fun ProfilePreview() {
//    ProfileBody(innerPadding = PaddingValues(0.dp))
//
//
//}