package com.example.pruebalukasfuenzalida2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class fotos extends AppCompatActivity {
    Button vol;
    String Lugaress;
    ImageButton map1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos);
        vol = (Button) findViewById(R.id.btn_volver);
        map1 = (ImageButton) findViewById(R.id.btn_mapa1);

        Bundle b = getIntent().getExtras();
        Lugaress = b.getString("Slugar");

        map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(I);
            }
        });

        vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);
            }
        });
    }
}