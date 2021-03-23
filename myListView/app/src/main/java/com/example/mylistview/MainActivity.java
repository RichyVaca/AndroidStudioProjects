package com.example.mylistview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView listMun;

    //Declaramos un arrayAdapter de objetos tipo municipios
    ArrayList<municipio> mpio = new ArrayList<municipio>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionar ListView
        listMun = (ListView)findViewById(R.id.listaMun);

        //Crear objetos de la clase municipio
        municipio ar = new municipio(1,"Armeria","2,403","30,203");
        mpio.add(ar);
        municipio col = new municipio(2,"Colima","102,365","40,263");
        mpio.add(col);
        municipio com = new municipio(3,"Comala","19,203","39,283");
        mpio.add(com);
        municipio coq = new municipio(4,"Coquimatlan","78,920","85,632");
        mpio.add(coq);
        municipio cuau = new municipio(5,"Cuauhtemoc","11,666","2,031");
        mpio.add(cuau);
        municipio ixtla = new municipio(6,"Ixtlahuacan","100,569","53,698");
        mpio.add(ixtla);
        municipio manz = new municipio(7,"Manzanillo","200,000","69874");
        mpio.add(manz);
        municipio min = new municipio(8,"Minatitlan","60,000","78,555");
        mpio.add(min);
        municipio tec = new municipio(9,"Tecoman","10,000","69,555");
        mpio.add(tec);
        municipio va = new municipio(10,"Villa de Alvarez","50,000","79,555");
        mpio.add(va);



        //Crear arrayAdapter para enlazar el archivo de recursos con los items
        ArrayAdapter<CharSequence> adaptador =  ArrayAdapter.createFromResource(this, R.array.arrayMunicipios ,android.R.layout.simple_list_item_1);


        //asignar el adapatador al ListView
        listMun.setAdapter(adaptador);

        //agregramos interactividad de los items del ListView
        listMun.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Seleccionaste: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();

                printMunicipio(mpio.get(position));
            }
        });
    }

    //Metodo para publicar los atributos de cada objetos
    private void printMunicipio(municipio m){
        AlertDialog.Builder vent = new AlertDialog.Builder(this);
        vent.setTitle("Datos de municipio ");
        vent.setMessage(m.getNummpio()+"\n"+m.getNombre()+"\n"+m.getExtension()+" km2 \n"+m.getPoblacion()+" Hab.");
        vent.setPositiveButton("Aceptar",null);
        vent.create();
        vent.show();
    }


}