

package com.example.atividade1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends  AppCompatActivity implements View.OnClickListener {
    Button btnAcessarLogin;
    Button btnLogin;
    EditText name;
    EditText login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.tName);
        login = findViewById(R.id.tLogin);
        btnLogin= findViewById(R.id.btnEntrar);




        btnAcessarLogin = findViewById(R.id.btnAcessar);
        btnAcessarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btnAcessar) {
                    Intent i = new Intent(MainActivity.this, login.class);
                    startActivity(i);
                }
            }
        });





    }


    @Override
    public void onClick(View v) {

    }
}

