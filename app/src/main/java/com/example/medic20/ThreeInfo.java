package com.example.medic20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThreeInfo extends AppCompatActivity { //Окно с информацией о Мониторинге
    TextView zaversh; //Объявляем элемент
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard34);
        zaversh = (TextView) findViewById(R.id.zaversh); //Находим элемент
        zaversh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThreeInfo.this, log_reg.class); //Осуществляем переход
                startActivity(intent);
            }
        });
    }
}
