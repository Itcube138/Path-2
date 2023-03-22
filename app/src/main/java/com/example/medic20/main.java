package com.example.medic20;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class main extends AppCompatActivity { //Окно с анализами и поиском. Класс создан 22.03.2023, Автор: Михалков Вадим
    ImageView prof;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        prof = (ImageView) findViewById(R.id.prof);
        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, user.class);
                startActivity(intent);
            }
        });
        ImageView analiz = (ImageView) findViewById(R.id.analiz);
        analiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main.this, "Раздел уже открыт", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView rezult = (ImageView) findViewById(R.id.rezult);
        rezult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main.this, "Не реализовано", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView podderg = (ImageView) findViewById(R.id.podderg);
        podderg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main.this, "Не реализовано", Toast.LENGTH_SHORT).show();
            }
        });
        Button dob1 = (Button) findViewById(R.id.dob1);
        Button dob2 = (Button) findViewById(R.id.dob2);
        dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, catalog.class);
                startActivity(intent);
            }
        });
        dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, catalog.class);
                startActivity(intent);
            }
        });
    }
}
