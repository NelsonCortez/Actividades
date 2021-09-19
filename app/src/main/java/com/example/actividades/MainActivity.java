package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast galleta = Toast.makeText(getApplicationContext(),"Hola a mi aplicacion en android", Toast.LENGTH_LONG) ;
        galleta.show();
    }

    public void Registro(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Pasaremos a la opción de registro", Toast.LENGTH_SHORT) ;
        toast.show();

        Intent registro = new Intent(this, ActivityReg.class);
        startActivity(registro);
    }
}