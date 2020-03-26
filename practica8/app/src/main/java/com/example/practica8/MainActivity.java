package com.example.practica8;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import android.os.Bundle;



    public class MainActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button1 = (Button) findViewById(R.id.Button01);
            button1.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    Intent i = new Intent(getApplicationContext(),
                            MainActivityDos.class);
                    i.putExtra("Valor1", "Android");
                    i.putExtra("Valor2", "Facil");
                    startActivity(i);
                }
            });
        }
    }

