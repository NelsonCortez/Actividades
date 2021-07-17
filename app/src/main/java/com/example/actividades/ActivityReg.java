package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityReg extends AppCompatActivity {
    private EditText Nom;
    private EditText Ape;
    private EditText Ide;
    private EditText Ema;
    private EditText Cel;
    private EditText Ciu;
    private EditText Uni;
    private EditText Prg;
    private TextView Err;
    private String lNom ;
    private String lApe ;
    private String lIde ;
    private String lEma ;
    private String lCel ;
    private String lCiu ;
    private String lUni ;
    private String lPrg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }

    public void Resultado(View view){
        Nom = findViewById(R.id.txtNom);
        Ape = findViewById(R.id.txtApe);
        Ide = findViewById(R.id.txtIde);
        Ema = findViewById(R.id.txtEma);
        Cel = findViewById(R.id.txtCel);
        Ciu = findViewById(R.id.txtCiu);
        Uni = findViewById(R.id.txtUni);
        Prg = findViewById(R.id.txtPrg);
        Err = findViewById(R.id.vwErr);

        lNom = Nom.getText().toString().trim();
        lApe = Ape.getText().toString().trim();
        lIde = Ide.getText().toString().trim();
        lEma = Ema.getText().toString().trim();
        lCel = Cel.getText().toString().trim();
        lCiu = Ciu.getText().toString().trim();
        lUni = Uni.getText().toString().trim();
        lPrg = Prg.getText().toString().trim();
        //Err.setText("Hola MUndo");
        if(!lNom.isEmpty() && !lEma.isEmpty()) {
            Intent resultado = new Intent(this, ActivityRes.class);

            resultado.putExtra("NOM", lNom);
            resultado.putExtra("APE", lApe);
            resultado.putExtra("IDE", lIde);
            resultado.putExtra("EMA", lEma);
            resultado.putExtra("CEL", lCel);
            resultado.putExtra("CIU", lCiu);
            resultado.putExtra("UNI", lUni);
            resultado.putExtra("PRG", lPrg);
            startActivity(resultado);
        }
        else
        {
            // Si Nombre  y email está vacio
            Err.setText("Faltan datos en el registro.  Ingrese la totalidad de información e intente nuevamente");
        }
    }

}