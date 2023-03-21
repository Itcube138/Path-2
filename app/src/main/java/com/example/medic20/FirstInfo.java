package com.example.medic20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FirstInfo extends AppCompatActivity { //Окно с информацией о анализах
    TextView prop1; //Объявляем элемент
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard1);
        prop1 = (TextView) findViewById(R.id.prop1); //Находим элемент
        prop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstInfo.this, TwoInfo.class); //Осуществляем переход
                startActivity(intent);
            }
        });

    }
}
