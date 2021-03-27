package com.example.dosactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnIr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIr = (Button)findViewById(R.id.btnA1);
    }

    /**
     * Metodo para saltar entre actividades (pantallas)
     */
    public void saltarToA2(View vista){
        //Creamos un objeto intent
        Intent i = new Intent(this, MainActivity2.class);
        //Ejecutar el intent
        startActivity(i);
    }
}