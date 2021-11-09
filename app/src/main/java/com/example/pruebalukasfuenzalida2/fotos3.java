package com.example.pruebalukasfuenzalida2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class fotos3 extends AppCompatActivity {
    Button vol3;
    String lugaritos;
    ImageButton map3, img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos3);
        vol3 = (Button) findViewById(R.id.volver3);
        map3 = (ImageButton) findViewById(R.id.btn_mapa3);
        img5 = (ImageButton) findViewById(R.id.btn_img5);
        img6 = (ImageButton) findViewById(R.id.btn_img6);

        Bundle b = getIntent().getExtras();
        lugaritos = b.getString("Slugar");

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),img5canon.class);
                startActivity(I);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),img6canon.class);
                startActivity(I);
            }
        });
        map3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MapsActivity3.class);
                startActivity(I);
            }
        });
        vol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);
            }
        });
    }
}