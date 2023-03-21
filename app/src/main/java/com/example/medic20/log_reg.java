package com.example.medic20;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class log_reg extends AppCompatActivity  { //Окно входа и регистрации
    Button SplashYA;
    Button Log;
    EditText E_mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_reg);
        SplashYA = (Button) findViewById(R.id.SplashYA);
        SplashYA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(log_reg.this, "Не реализовано", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        Log = (Button) findViewById(R.id.Log);
        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(log_reg.this, kodEmail.class); //Осуществляем переход
                startActivity(intent);
            }
        });
    }
}
