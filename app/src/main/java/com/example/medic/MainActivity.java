package com.example.medic;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { //Начало работы приложения. Класс создан 21.03.2023, Автор: Михалков Вадим

    TextView prop12;
    TextView prop22;
    TextView zaversh1;
    TextView windows;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        windows = (TextView) findViewById(R.id.window);
        Intent();
    }

    public void Intent(){
        Intent intent = new Intent(MainActivity.this, FirstInfo.class);
    }
}