package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnLogin;
        EditText name;
        EditText login;

        name = findViewById(R.id.tName);
        login = findViewById(R.id.tLogin);
        btnLogin= findViewById(R.id.btnEntrar);




        btnLogin = findViewById(R.id.btnEntrar);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().equals(name.getText().toString())) {
                        Intent i = new Intent(login.this, telaPrincipal.class);
                        startActivity(i);

                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
                    builder.setTitle("Aviso");
                    builder.setMessage("Dados Incorretos");
                    builder.setCancelable(true);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent x = new Intent(login.this, login.class);
                            login.this.startActivity(x);
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
            }
        });

    }
}