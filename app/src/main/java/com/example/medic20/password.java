package com.example.medic20;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
@SuppressLint("MissingInflatedId")
public class password extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password);
        TextView prop122 = (TextView) findViewById(R.id.prop122);
        prop122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(password.this, card_pac.class);
                startActivity(intent);
            }
        });
    }
}
