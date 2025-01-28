package com.example.perpustakaan.ui.view.peminjaman

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.perpustakaan.R
import com.example.perpustakaan.ui.navigasi.AlamatNavigasi

object DestinasiHomePeminjaman : AlamatNavigasi {
    override val route = "homePeminjaman"
    override val titleRes = "Data Peminjaman"
}

@Composable
fun OnLoading(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(64.dp),
        painter = painterResource(R.drawable.iconloading),
        contentDescription = "Loading"
    )
}

@Composable
fun OnError(retryAction: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Terjadi kesalahan saat mengambil data")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = retryAction) {
            Text(text = "Coba Lagi")
        }
    }
}