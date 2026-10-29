package ec.com.pablorcruh.food_delivery.ui.features.auth

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ec.com.pablorcruh.food_delivery.R
import ec.com.pablorcruh.food_delivery.ui.theme.Orange

@Composable
fun AuthScreen(){
    val imageSize = remember{
        mutableStateOf(IntSize.Zero)
    }
    val brush = Brush.verticalGradient(
        colors = listOf(
            Color.Transparent,
            Color.Black
        ),
        startY = imageSize.value.height.toFloat() / 3,

    )
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)){
        Image(painter = painterResource(R.drawable.background),
            contentDescription = "background image",
            modifier = Modifier
                .onGloballyPositioned {
                    imageSize.value = it.size
                }
                .alpha(0.6f),
            contentScale = ContentScale.FillBounds
        )
        Box(modifier = Modifier
            .matchParentSize()
            .background(brush = brush)
        )
        Button(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            onClick = {}
        ){
            Text(
                text = stringResource(R.string.skip),
                color = Orange
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 110.dp)
                .padding(16.dp)
        ){
            Text(
                modifier = Modifier,
                text = stringResource(R.string.welcome),
                color = Color.Black,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier,
                text = stringResource(R.string.foodhub),
                color = Orange,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.padding(vertical = 16.dp),
                text = stringResource(R.string.food_hub_desc),
                color = Color.DarkGray,
                fontSize = 20.sp
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "SignIn", color = Color.White, fontWeight = FontWeight.Bold)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    shape = RoundedCornerShape(32.dp),
                    onClick = {}
                ){
                    Row(
                        modifier = Modifier.padding(start = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(R.drawable.ic_facebook),
                            contentDescription= "Facebook Logo")
                        Spacer(modifier = Modifier.size(8.dp))
                        Text(text = "Facebook", color =  Color.Black)
                    }
                }
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    shape = RoundedCornerShape(32.dp),
                    onClick = {}
                ){
                    Row(
                        modifier = Modifier.padding(start = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(R.drawable.ic_google),
                            contentDescription= "Google Logo")
                        Spacer(modifier = Modifier.size(8.dp))
                        Text(text = "Google", color =  Color.Black)
                    }
                }

            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha =0.5f)),
                shape = RoundedCornerShape(32.dp),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Text(
                    text = "Signin with Email"
                )
            }
            
            TextButton(
                onClick = {}
            ){
                Text(
                    text = stringResource(R.string.you_already_have_an_account),
                    color = Color.White
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun previewAuthScreen(){
    AuthScreen()
}

