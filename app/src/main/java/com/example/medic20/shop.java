package com.example.medic20;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("MissingInflatedId")
public class shop extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        ImageButton Back1 = (ImageButton) findViewById(R.id.Back1);
        Back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shop.this, catalog.class);
                startActivity(intent);
            }
        });
        ImageButton delete = (ImageButton) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(shop.this, "Не реализовано", Toast.LENGTH_SHORT).show();
            }
        });
        Button oformzak = (Button) findViewById(R.id.oformzak);
        oformzak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shop.this, oformzak.class);
                startActivity(intent);
            }
        });
    }
}
