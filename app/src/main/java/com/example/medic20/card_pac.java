package com.example.medic20;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
@SuppressLint("MissingInflatedId")
public class card_pac extends AppCompatActivity  {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carp_pac);
        TextView prop123 = (TextView) findViewById(R.id.prop123);
        prop123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(card_pac.this, main.class);
                startActivity(intent);
            }
        });
    }
}
