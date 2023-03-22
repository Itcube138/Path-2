package com.example.medic20;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class catalog extends AppCompatActivity { //Окно с каталогом. Класс создан 22.03.2023, Автор: Михалков Вадим
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        ImageView analiz3 = (ImageView) findViewById(R.id.analiz3);
        analiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, main.class);
                startActivity(intent);
            }
        });
        ImageView prof3 = (ImageView) findViewById(R.id.prof3);
        prof3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, user.class);
                startActivity(intent);
            }
        });
        ImageView rezult3 = (ImageView) findViewById(R.id.rezult3);
        rezult3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(catalog.this, "Не реализовано", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView podderg3 = (ImageView) findViewById(R.id.podderg3);
        podderg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(catalog.this, "Не реализовано", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
