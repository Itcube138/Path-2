package com.example.medic20;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("MissingInflatedId")
public class oformzak extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oformzak);
        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oformzak.this, shop.class);
                startActivity(intent);
            }
        });
        Button zakazat = (Button) findViewById(R.id.zakazat);
        zakazat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oformzak.this, LoadBank.class);
                startActivity(intent);
            }
        });
        EditText pacient = (EditText) findViewById(R.id.pacient);
        EditText addres = (EditText) findViewById(R.id.addres);
        EditText data = (EditText) findViewById(R.id.data);
        Button pacient2 = (Button) findViewById(R.id.pacient2);

        pacient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oformzak.this, zaglushka.class);
                startActivity(intent);
            }
        });
        pacient2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oformzak.this, zaglushka.class);
                startActivity(intent);
            }
        });
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oformzak.this, zaglushka.class);
                startActivity(intent);
            }
        });
        addres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oformzak.this, zaglushka.class);
                startActivity(intent);
            }
        });
    }
}
