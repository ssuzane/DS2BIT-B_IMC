package br.senai.sp.jandira.imc_suzane

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.resolveDefaults
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc_suzane.ui.theme.ImcSuzaneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImcSuzaneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){

        Column(modifier = Modifier
            .fillMaxSize()
            .height(200.dp)
            .background(Color(0xFFED145B))
            .padding(16.dp),

            //para Colocar no centro
            horizontalAlignment = Alignment.CenterHorizontally){

            Image(modifier = Modifier.size(80.dp),
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "",
                )

            Text(modifier = Modifier.padding(25.dp),
                text = "CALCULADORA IMC",
                color = Color.White,
                fontSize = 30.sp
            )

            Card(colors = CardDefaults.cardColors(containerColor = Color(0xFFF9F6F6)),
                modifier = Modifier
                    .padding(horizontal = 1.dp)
                    .offset(y = -30.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp,
                    hoveredElevation = 20.dp)
            ) {

                Column(modifier = Modifier
                    .padding(30.dp)
                    .fillMaxWidth())
                {
                    Text(modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth(),
                        text = "Seus Dados",
                        color = Color(0xFFED145B),
                        fontSize = 26.sp, textAlign = TextAlign.Center
                    )
                    Text(modifier = Modifier.padding(9.dp),text = "Seu Peso:", color = Color(0xFFED145B))
                    OutlinedTextField(value = "",
                        onValueChange = {},
                        placeholder = {
                            Text(modifier = Modifier.offset(y = -3.dp),text = "Seu peso em Kg")
                        },
                        colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFED145B))

                        )

                    Text(modifier = Modifier.padding(9.dp),text = "Sua Altura:", color = Color(0xFFED145B))
                    OutlinedTextField(value = "",
                        onValueChange = {},
                        placeholder = {
                            Text(modifier = Modifier.offset(y = -3.dp),text = "Sua Altura em cm")
                        },
                        colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFED145B))
                    )

                    Button(modifier = Modifier
                        .padding(vertical = 24.dp)
                        .fillMaxWidth(), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFED145B)),
                        shape = RoundedCornerShape(8.dp),
                        onClick = { /*TODO*/ })
                    {

                        Text(text = "CALCULAR")

                    }
                }

            }

            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xff329F6B))

            ){
                Row (modifier = Modifier
                    .padding(29.dp)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "resultado", color = Color(0xffFFFFFF),fontSize = 20.sp, textAlign = TextAlign.Center)
                        //so para o tamanho de letra
                        Text(text = "peso atual", textAlign = TextAlign.Center, fontSize = 30.sp, color = Color(0xffFFFFFF))
                    }

                    Text(text = "21.3", color = Color.White, fontSize = 36.sp)

                }


            }

        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImcSuzaneTheme {
        Greeting()
    }
}