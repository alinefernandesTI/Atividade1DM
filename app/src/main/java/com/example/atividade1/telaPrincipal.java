package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaPrincipal extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        Button irLogin = (Button)findViewById(R.id.btnIrLogin);
        irLogin.setOnClickListener(this);
        Button irHome = (Button)findViewById(R.id.btnIrInicio);
        irHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnIrInicio: {
                Intent i = new Intent(telaPrincipal.this, MainActivity.class);
                startActivity(i);
            }
            break;


            case R.id.btnIrLogin: {
                Intent i = new Intent(telaPrincipal.this, login.class);
                startActivity(i);
                break;
            }
        }

    }
}