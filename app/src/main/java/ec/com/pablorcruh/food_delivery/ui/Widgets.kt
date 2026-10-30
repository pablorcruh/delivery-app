package ec.com.pablorcruh.food_delivery.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ec.com.pablorcruh.food_delivery.R
import ec.com.pablorcruh.food_delivery.ui.features.components.SocialButton

@Composable
fun GroupSocialButtons(
    color: Color = Color.White,
    onFacebookClick: () -> Unit,
    onGoogleClick: ()-> Unit){

    Column() {
        Row(
            modifier= Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            HorizontalDivider(
                modifier = Modifier.weight(1f).padding(start = 8.dp),
                thickness = 1.dp,
                color = color
            )
            Text(
                modifier = Modifier.padding(8.dp),
                text = stringResource(R.string.sign_in_with),
                color = color)
            HorizontalDivider(
                modifier = Modifier.weight(1f).padding(end = 8.dp),
                thickness = 1.dp,
                color = color
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SocialButton(
                icon = R.drawable.ic_facebook,
                title = R.string.signin_with_facebook,
                onClick = onFacebookClick
            )
            SocialButton(
                icon = R.drawable.ic_google,
                title = R.string.signin_with_google,
                onClick = onGoogleClick
            )
        }
    }
}

