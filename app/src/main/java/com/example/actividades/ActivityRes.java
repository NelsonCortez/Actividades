package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityRes extends AppCompatActivity {
    private TextView vNom ;
    private TextView vApe ;
    private TextView vIde ;
    private TextView vEma ;
    private TextView vCel ;
    private TextView vCiu ;
    private TextView vUni ;
    private TextView vPrg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        vNom = findViewById(R.id.vwNom);
        vApe = findViewById(R.id.vwApe);
        vIde = findViewById(R.id.vwIde);
        vEma = findViewById(R.id.vwEma);
        vCel = findViewById(R.id.vwCel);
        vCiu = findViewById(R.id.vwCiu);
        vUni = findViewById(R.id.vwUni);
        vPrg = findViewById(R.id.vwPrg);

        vNom.setText("Nombres : " + getIntent().getStringExtra("NOM"));
        vApe.setText("Apellidos : " + getIntent().getStringExtra("APE"));
        vIde.setText("Identidad : " + getIntent().getStringExtra("IDE"));
        vEma.setText("Email : " + getIntent().getStringExtra("EMA"));
        vCel.setText("Celular : " + getIntent().getStringExtra("CEL"));
        vCiu.setText("Ciudad : " + getIntent().getStringExtra("CIU"));
        vUni.setText("Universidad : " + getIntent().getStringExtra("UNI"));
        vPrg.setText("Programa : " + getIntent().getStringExtra("PRG"));

    }

    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    public void Salir(View view){
        this.finishAffinity();
    }
}