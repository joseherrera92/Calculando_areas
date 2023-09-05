package com.calculando.calculando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ladoUno, ladoDos;
    TextView resultado;
    Button calculo;

    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ladoUno = findViewById(R.id.sideOne);
        ladoDos = findViewById(R.id.sideTwo);
        resultado = findViewById(R.id.resultado);
        calculo = findViewById(R.id.calcular);

        calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float valueOne = Float.parseFloat(ladoUno.getText().toString());
                float valueTwo = Float.parseFloat(ladoDos.getText().toString());
                result = ((valueOne*valueTwo)/2);
                resultado.setText("El resultado es: "+String.valueOf(result));
            }
        });
    }
}