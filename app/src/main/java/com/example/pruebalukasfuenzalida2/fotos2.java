package com.example.pruebalukasfuenzalida2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class fotos2 extends AppCompatActivity {
    Button vol2;
    String lugares;
    ImageButton map2, im3,im4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos2);
        vol2 = (Button) findViewById(R.id.volver2);
        map2 = (ImageButton) findViewById(R.id.btn_mapa2);

        im3 = (ImageButton) findViewById(R.id.btn_img3);
        im4 = (ImageButton) findViewById(R.id.btn_img4);

        Bundle b = getIntent().getExtras();
        lugares = b.getString("Slugar");

        map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MapsActivity2.class);
                startActivity(I);
            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),img3torre.class);
                startActivity(I);
            }
        });

        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),img4torre.class);
                startActivity(I);
            }
        });
        vol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);
            }
        });
    }
}