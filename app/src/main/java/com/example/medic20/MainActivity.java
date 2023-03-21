package com.example.medic20;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { //Начало работы приложения. Класс создан 21.03.2023, Автор: Михалков Вадим
    ConstraintLayout winLoad;  //Объявляем элемент
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winLoad = (ConstraintLayout) findViewById(R.id.winLoad); //Находим элемент
        winLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstInfo.class); //Осуществляем переход
                startActivity(intent);
            }
        });
    }

}