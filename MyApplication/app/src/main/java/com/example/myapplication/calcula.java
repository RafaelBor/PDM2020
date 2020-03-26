package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class calcula extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResultado=(TextView)findViewById(R.id.resultado);
        final EditText edtnumero1=(EditText) findViewById(R.id.numero1);
        final EditText edtnumero2=(EditText) findViewById(R.id.numero2);
        final Button btnSuma=(Button) findViewById(R.id.btnSuma);
        final Button btnResta=(Button) findViewById(R.id.btnResta);
        final Button btnMultiplicar=(Button) findViewById(R.id.btnMutiplicar);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strnumero1=edtnumero1.getText().toString();
                String strnumero2=edtnumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(), "Introduzca los numeros", Toast.LENGTH_SHORT).show();
                    return;
                }
                int numero1=Integer.parseInt(strnumero1);
                int numero2=Integer.parseInt(strnumero2);
                txtResultado.setText("Resultado : " + String.valueOf(numero1+numero2));

            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strnumero1=edtnumero1.getText().toString();
                String strnumero2=edtnumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(), "Introduzca los numeros", Toast.LENGTH_SHORT).show();
                    return;
                }
                int numero1=Integer.parseInt(strnumero1);
                int numero2=Integer.parseInt(strnumero2);
                txtResultado.setText("Resultado : " + String.valueOf(numero1-numero2));

            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strnumero1=edtnumero1.getText().toString();
                String strnumero2=edtnumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(), "Introduzca los numeros", Toast.LENGTH_SHORT).show();
                    return;
                }
                int numero1=Integer.parseInt(strnumero1);
                int numero2=Integer.parseInt(strnumero2);
                txtResultado.setText("Resultado : " + String.valueOf(numero1*numero2));

            }
        });
    }
}
