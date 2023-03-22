package com.example.medic20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TwoInfo extends AppCompatActivity { //Окно с информацией о уведомлениях. Класс создан 22.03.2023, Автор: Михалков Вадим
    TextView prop2; //Объявляем элемент
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard3);
        prop2 = (TextView) findViewById(R.id.prop2); //Находим элемент
        prop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TwoInfo.this, ThreeInfo.class); //Осуществляем переход
                startActivity(intent);
            }
        });
    }
}
