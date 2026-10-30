package ec.com.pablorcruh.food_delivery.ui.features.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun SocialButton(
    icon: Int,
    title: Int,
    onClick: () -> Unit
){
    Button(
        modifier = Modifier,
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(32.dp),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier.padding(start = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(icon),
                contentDescription = null
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = stringResource(title), color = Color.Black)
        }
    }
}