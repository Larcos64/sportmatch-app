package com.example.sportmatch.usecases.screens.register

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sportmatch.R
import com.example.sportmatch.usecases.auth.sign_in.UserData
import com.example.sportmatch.usecases.common.appBarUtil


@Composable
fun RegisterAs(
    navController: NavController,
    userData: UserData?,
    onSignOut: () -> Unit,
    onClickAthlete: () -> Unit,
    onClickEstablishment: () -> Unit,
) {
    val context = LocalContext.current

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        /*
        if (userData?.profilePictureUrl != null) {
            AsyncImage(
                model = userData.profilePictureUrl,
                contentDescription = "Profile picture",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
        Button(onClick = onSignOut) {
            Text(text = "Cerrar sesión")
        }*/
    }
    /*if (userData?.username != null) {
        Text(
            text = userData.username,
            color = MaterialTheme.colorScheme.tertiary,
            textAlign = TextAlign.Center,
            fontSize = 36.sp,
            fontWeight = FontWeight.SemiBold
        )
    }*/
    appBarUtil.getAppBar(
        title = stringResource(id = R.string.establishment_registration),
        navigation = { navController.navigateUp() }
    )

    Text(
        text = stringResource(id = R.string.register_as),
        color = MaterialTheme.colorScheme.tertiary,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineLarge
    )

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(16.dp))
        Image(
            modifier = Modifier
                .clickable(
                enabled = true,
                onClickLabel = stringResource(id = R.string.athlete),
                onClick = onClickAthlete
            )
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp, bottom = 16.dp),
            painter = painterResource(id = R.drawable.img_athletes_title),
            contentDescription = stringResource(id = R.string.athlete)
        )

        Spacer(Modifier.height(16.dp))
        Image(
            modifier = Modifier
                .clickable(
                    enabled = true,
                    onClickLabel = stringResource(id = R.string.athlete),
                    onClick = onClickEstablishment
                )
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp, bottom = 16.dp),
            painter = painterResource(id = R.drawable.img_establishments_title),
            contentDescription = stringResource(id = R.string.establishment)
        )
    }
}