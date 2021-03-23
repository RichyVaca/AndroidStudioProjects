package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnC,btnO,btnS;
    private EditText txtA, txtP;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionar componentes graficos

        btnC = (Button)findViewById(R.id.btnCalcular);
        btnO = (Button)findViewById(R.id.btnNuevo);
        btnS = (Button)findViewById(R.id.btnSalir);

        txtA = (EditText)findViewById(R.id.idCampoMetros);
        txtP = (EditText)findViewById(R.id.idCampoKg);

        img = (ImageView)findViewById(R.id.imageView);
    }

    //Metodo para obtener el IMC
    public void calcularImc(View vista){

        String cat;

        //Leer la propiedad text de cada EditText
        String cad = txtA.getText().toString();
        float altura = Float.parseFloat(cad);

        cad = txtP.getText().toString();
        float peso = Float.parseFloat(cad);

        float imc = (float) (peso/Math.pow(altura, 2));

        //identificar categoraias
        if (imc < 16 ){
            cat = "Tienes infrapeso, delgadez severa";
            //Mostrar imagen en el ImageView

            img.setImageDrawable(getDrawable(R.drawable.delgadezsevera));
        }
        else if (imc >= 16 && imc <= 16.99){
            cat = "Tienes infrapeso, delgadez, moderada";
        }
    }

    //Metodo para imprimir resutado
    private void muestraResultado(Float vimc, String msg){
        Toast.makeText(this, vimc+msg, Toast.LENGTH_SHORT).show();
    }


}