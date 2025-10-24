


@Composable
fun CalculatorScreen() {
    // Estado para almacenar el texto de la pantalla
    var inputText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        // Pantalla de entrada (TextField)
        TextField(
            value = inputText,
            onValueChange = { inputText = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            textStyle = LocalTextStyle.current.copy(
                fontSize = 36.sp,
                textAlign = TextAlign.End,
                color = Color.White
            ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.White
            ),
            singleLine = true
        )

        // Aquí colocaremos la cuadrícula de botones
        CalculatorGrid { label ->
            inputText += label
        }
    }
}