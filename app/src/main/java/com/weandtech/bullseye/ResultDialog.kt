package com.weandtech.bullseye

import android.app.AlertDialog
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun ResultDialog(
    hideDialog: () -> Unit,
    sliderValue: Int,
    points: Int,
    modifier: Modifier = Modifier
) {
    AlertDialog(
        onDismissRequest = {
            hideDialog()
        },
        confirmButton = {
            TextButton(
                onClick = { hideDialog() }
            ) {
                Text(text = stringResource(id = R.string.result_dialog_button_text))
            }
        },
        title = { Text(text = stringResource(id = R.string.result_dialog_title)) },
        text = { Text(text = stringResource(id = R.string.result_dialog_message, sliderValue, points)) }
//        text = { Text(text = "The slider's value is $sliderValue") }
    )
}