package com.example.dosactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2 = (Button)findViewById(R.id.btnA2);

    }

    public void saltarToA1(View vista2){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}