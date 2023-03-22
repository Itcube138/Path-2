package com.example.medic20;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
@SuppressLint("MissingInflatedId")
public class user extends AppCompatActivity { // //Окно с картой пациента. Класс создан 22.03.2023, Автор: Михалков Вадим
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        ImageView analiz2 = (ImageView) findViewById(R.id.analiz2);
        analiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user.this, main.class);
                startActivity(intent);
            }
        });
        ImageView prof2 = (ImageView) findViewById(R.id.prof2);
        prof2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(user.this, "Раздел уже открыт", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView rezult2 = (ImageView) findViewById(R.id.rezult2);
        rezult2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(user.this, "Не реализовано", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView podderg2 = (ImageView) findViewById(R.id.podderg2);
        podderg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(user.this, "Не реализовано", Toast.LENGTH_SHORT).show();
            }
        });
        Button save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(user.this, "Не реализовано", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
