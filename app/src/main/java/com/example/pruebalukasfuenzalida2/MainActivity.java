package com.example.pruebalukasfuenzalida2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner lug;
    Button cont;
    ArrayList<String> valores= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lug = (Spinner) findViewById(R.id.lugares);
        cont = (Button) findViewById(R.id.continuar);

        valores.add(".....");
        valores.add("Torre Eiffel");
        valores.add("Muralla China");
        valores.add("Gran cañon");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valores);
        lug.setAdapter(adaptador);

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lug.getSelectedItem() == "....."){
                    Toast.makeText(getApplicationContext(), "Debe seleccionar  un lugar", Toast.LENGTH_LONG);
                }
                if(lug.getSelectedItem() == "Muralla China"){
                    String lu = lug.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(),fotos.class);
                    I.putExtra("Slugar", lu);
                    startActivity(I);
                }
                if(lug.getSelectedItem() == "Torre Eiffel"){
                    String lu = lug.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(),fotos2.class);
                    I.putExtra("Slugar", lu);
                    startActivity(I);
                }
                if(lug.getSelectedItem() == "Gran cañon"){
                    String lu = lug.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(),fotos3.class);
                    I.putExtra("Slugar", lu);
                    startActivity(I);
                }
            }
        });
    }
}