package com.example.medic20;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kodEmail extends AppCompatActivity { //окно с запросом кода подтверждения
    TextView prop2; //Объявляем элемент
    Button podpas; //Объявляем элемент
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kod_email);
        podpas = (Button) findViewById(R.id.podpas); //Находим элемент
        podpas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kodEmail.this, password.class);//Переход
                startActivity(intent);
            }
        });
    }
}
