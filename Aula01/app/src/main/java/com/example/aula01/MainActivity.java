package com.example.aula01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nome, idade;

    TextView resultado;

    Button botaoImprimir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        /* Início do código */

        nome = findViewById(R.id.nome);
        idade = findViewById(R.id.idade);
        resultado = findViewById(R.id.resultado);
        botaoImprimir = findViewById(R.id.botaoImprimir);

        botaoImprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            resultado.setText("Resultado: " + nome.getText().toString() + ", sua idade é " + idade.getText().toString());

            }
        });

    }
}