package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnI, btnD, btnR;
    private TextView textContador;
    private int contador = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relacioner los componente de la vista y los del controlador

        btnI = (Button)findViewById(R.id.btnInc);
        btnD = (Button)findViewById(R.id.btnDec);
        btnR = (Button)findViewById(R.id.btnReset);

        textContador = (TextView)findViewById(R.id.idCampo);
    }
    //Metodo para incrementar el metodo
    public void incrementarContador (View view){

        if (contador >= 99){
            Toast.makeText(this, "LIMITE ALCANZADO", Toast.LENGTH_LONG).show();
        }else{
            this.contador++;
            this.muestraContador();
        }
        //Invocamos al metodo muestraContador para imprimir

    }
    public void decrementarContador (View view){

        if (contador <= -11){
            Toast.makeText(this, "LIMITE ALCANZADO", Toast.LENGTH_LONG).show();
        }else{
            this.muestraContador();
            this.contador--;

        }
        //Invocamos al metodo muestraContador para imprimir

    }
    public void resetearContador (View view){
        this.contador = 0;
        //Invocamos al metodo muestraContador para imprimir
        this.muestraContador();
    }
    //Metodo para mostrar el valor de contador en el campo de texto
    private void muestraContador(){
        textContador.setText(Integer.toString(this.contador));


    }
}