package com.example.menuoverflow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Metodo para crear el menu overflow
     */

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menuoverflow, menu);
        return true;
    }

    /**
     * Metodo para procesar las opciones del menu overflow
     */
    public boolean onOptionsItemsSelected(MenuItem item){
        int i = item.getItemId();
        //Estructura selectiva
        if (i == R.id.suma){
            Toast.makeText(this, "Seleccionaste suma", Toast.LENGTH_SHORT).show();
        }else if(i == R.id.resta){
            Toast.makeText(this, "Seleccionaste resta", Toast.LENGTH_SHORT).show();
        }else if(i == R.id.multiplica){
            Toast.makeText(this, "Seleccionaste multiplicacion", Toast.LENGTH_SHORT).show();
        }else if(i == R.id.dividir){
            Toast.makeText(this, "Seleccionaste dividir", Toast.LENGTH_SHORT).show();
        }else if(i == R.id.salir){
            AlertDialog.Builder win = new AlertDialog.Builder(this);
            win.setTitle("Atencion");
            win.setMessage("Salir de la aplicacion");
            win.setPositiveButton("Aceptar", ((dialogInterface, ) -> {
                salir();
            }));
            win.create();
            win.show();
        }
        return super.onOptionsItemSelected(item);
    }
    public void salir(){
        System.exit(0);
    }
}