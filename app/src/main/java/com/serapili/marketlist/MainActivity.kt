package com.serapili.marketlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.serapili.marketlist.ui.theme.MarketListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                Column {

                    List()
                }
            }

        }
    }
}


@Composable
fun List(){
    Text("Lista de compras:")
    Text("Arroz")
    Text("Feijão")
    Text("Açucar")
    Text("Café")
    Text("Macarrão")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MarketListTheme {
        List()
    }
}