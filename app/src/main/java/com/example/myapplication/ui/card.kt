//package com.example.myapplication.ui
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
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
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.KeyboardArrowLeft
//import androidx.compose.material.icons.filled.KeyboardArrowRight
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.myapplication.R
//import com.example.myapplication.ui.ui.theme.MyApplicationTheme
//val MintGreen = Color(0xFF3FD4A3)
//
//class card : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Scaffold { innerPadding ->
//                ProfileBody1(innerPadding)
//
//        }}}}
//@Composable
//fun ProfileBody1(innerPadding: PaddingValues) {
//    Column(
//        modifier = Modifier
//
//            .padding(innerPadding)
//            .fillMaxSize()
//            .background(MintGreen)
//
//
//    ) {
//        Row (
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 0.dp, vertical = 10.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.Absolute.Right
//
//
//
//
//
//        ){
//            Image(
//                painter = painterResource(R.drawable.ij),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//
//                    .height(50.dp)
//                    .width(50.dp)
//                    .clip(shape = androidx.compose.foundation.shape.CircleShape))
//
//            }
//        Row (
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 10.dp, vertical = 0.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween
//
//
//
//        ){
//            Text(
//                text = "Card",
//                fontSize = 40.sp,
////                fontFamily = FontFamily.SansSerif,
//                fontWeight = FontWeight.Bold,
//                color = Color.White,
//                modifier = Modifier.padding(start = 0.dp)
//
//
//
//
//            )
//        }
//        Row (
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 10.dp, vertical = 0.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween
//
//
//
//        ){
//            Text(
//                text = "Simple and easy way to use app",
//                fontSize = 20.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color.White,
//                modifier = Modifier.padding(start = 0.dp)
//
//
//
//
//            )
//        }
//        Row ( modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 0.dp, vertical = 50.dp, ),
////            .weight(),
//
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceAround
//
//
//
//        )
//        {
//            Column(
//
//                modifier = Modifier
//                    .padding(innerPadding)
//                    .size(160.dp)
//                    .background(color = Color.White)
//
//
//
//
//            ){ Row ( modifier = Modifier
////                .fillMaxWidth()
//                .padding(horizontal = 0.dp, vertical = 0.dp, ),
////            .weight(),
//
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceEvenly
//
//
//
//            ) {
//                Image(
////                              modifier = ,
//                    painter = painterResource(R.drawable.ij),
////                tint = Color.Black,
//                    contentDescription = null,
//                    contentScale = ContentScale.Fit,
//                    modifier = Modifier
//
//
////                        .fillMaxWidth()
//                        .padding(horizontal = 40.dp, vertical = 40.dp,),
//
////            .weight(),
////                    .clip(shape = androidx.compose.foundation.shape.)
//
//
//                )
//                Text(
//                    text = "text",
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color.Black,
//                    modifier = Modifier.padding(horizontal = 0.dp, vertical = 0.dp, ),
//
//
//
//
//
//
//                )
//
//
//
//
//            }
////                Row ( modifier = Modifier
//////                    .fillMaxWidth()
////                    .padding(horizontal = 0.dp, vertical = 90.dp, ),
//////            .weight(),
////
//////                    verticalAlignment = Alignment.CenterVertically,
//////                    horizontalArrangement = Arrangement.SpaceEvenly
////                ){
////
////                    }
//////                Row (modifier = Modifier
////////                    .fillMaxWidth()
//////                    .padding(horizontal = 60.dp, vertical = 60.dp, ),
////////            .weight(),
//////
//////                    verticalAlignment = Alignment.Bottom,
//////                    horizontalArrangement = Arrangement.SpaceBetween
//////
//////
//////                ){
//////                    Text(
//////                        text = "Simple and easy way to use app",
//////                        fontSize = 20.sp,
//////                        fontWeight = FontWeight.Bold,
//////                        color = Color.Black,
//////                        modifier = Modifier.padding(start = 0.dp)
//////
//////
//////
//////
//////                    )
//////
//////                }
//
//
//
//
//
////
//
//            }
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//
//                    .padding(innerPadding)
//                    .size(160.dp)
//                    .background(color = Color.White)
//
//
//
//            ){
//                Image(
//
////                              modifier = ,
//                    painter = painterResource(R.drawable.ij),
////                tint = Color.Black,
//                    contentDescription = null,
//                    contentScale = ContentScale.Fit,
//                    modifier = Modifier
//
//
//
//                        .fillMaxWidth()
//                        .padding(horizontal = 40.dp, vertical = 40.dp, ),
//
//
//
//
////            .weight(),
////                    .clip(shape = androidx.compose.foundation.shape.)
//
//                )
////                Text()
////                Row ( modifier = Modifier
////                    .fillMaxWidth()
////                    .padding(horizontal = 10.dp, vertical = 50.dp, ),
//////            .weight(),
////
////                    verticalAlignment = Alignment.CenterVertically,
////                    horizontalArrangement = Arrangement.SpaceBetween
////
////
////
////                )
//
////                {
//////                           Text(
//////                    text = "Bhagwat Geeta",
//////                    fontSize = 20.sp,
//////                    fontWeight = FontWeight.Bold,
//////                    color = Color.Black,
//////                    modifier = Modifier.padding(start = 80.dp)
//////                           )
//            }
//
//
//
//
//
//
//
//
//        }
//
//
//
//
//
//
//
//        }
//
//
//     Row ( modifier = Modifier
////        .fillMaxWidth()
//
//        .padding(horizontal = 10.dp, vertical = 40.dp, ),
////            .weight(),
//
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceEvenly
//
//
//
//    ){
//
//        Column(
//
//            modifier = Modifier
//                .padding(innerPadding)
//                .size(160.dp)
//                .background(color = Color.White)
//
//
//
//
//        ){
//
//        }
//    }
//
//    }
//
//
//@Composable
//fun ProfilePreview() {
//    ProfileBody1(innerPadding = PaddingValues(0.dp))
//}