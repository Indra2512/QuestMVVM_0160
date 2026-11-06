package com.example.myarsitekturmvvm.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.mvvmarsitekture.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    //edit 1 : parameter pelihanJK dan onSubmitButtonClicked
    pilihanJK: List<String> ,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
) {

    // edit 2 : tambahkan 4 variable dibawah ini
    var txtNama by rememberSaveable {
        mutableStateOf("")
    }

    var txtAlamat by remember {
        mutableStateOf("")
    }

    var txtGender by remember {
        mutableStateOf("")
    }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(
                        id = R.color.purple_500
                    )
                )
            )
        }