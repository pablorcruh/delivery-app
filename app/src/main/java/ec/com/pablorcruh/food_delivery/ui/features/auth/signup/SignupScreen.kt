package ec.com.pablorcruh.food_delivery.ui.features.auth.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ec.com.pablorcruh.food_delivery.R
import ec.com.pablorcruh.food_delivery.ui.GroupSocialButtons
import ec.com.pablorcruh.food_delivery.ui.features.components.FoodHubTextField
import ec.com.pablorcruh.food_delivery.ui.theme.Orange

@Composable
fun SignupScreen(){
    Box(
        modifier = Modifier.fillMaxSize()
    )
    Image(
        painter = painterResource(R.drawable.ic_auth_bg),
        contentDescription = null,
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier.weight(1f)
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text=stringResource(R.string.sign_up),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.size(20.dp))
        FoodHubTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = stringResource(id = R.string.full_name),
                    color = Color.Gray)
            },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()
        )
        FoodHubTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = stringResource(id = R.string.email),
                    color = Color.Gray)
            },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()
        )
        FoodHubTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = stringResource(id = R.string.password),
                    color = Color.Gray)
            },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation(),
            trailingIcon = {
                Image(
                    painter = painterResource(R.drawable.ic_eye),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
        )
        Spacer(
            modifier = Modifier.size(16.dp)
        )
        Button(
            modifier = Modifier.height(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Orange),
            onClick = {}
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 32.dp),
                text = stringResource(R.string.sign_up)
            )
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            modifier = Modifier
                .padding(8.dp)
                .clickable{}
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = stringResource(id = R.string.you_already_have_an_account)
        )
        GroupSocialButtons(
            color = Color.Black,
            onGoogleClick = {},
            onFacebookClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSignupScreen(){
    SignupScreen()
}