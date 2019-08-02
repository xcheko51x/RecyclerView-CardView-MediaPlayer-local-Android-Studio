package com.xcheko51x.rvcvmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvLista;

    List<Sonido> listaSonidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLista = findViewById(R.id.rvLista);
        rvLista.setLayoutManager(new GridLayoutManager(this, 1));

        listaSonidos = new ArrayList<Sonido>();

        listaSonidos.add(new Sonido("Cancion 1", "sonidoUno"));
        listaSonidos.add(new Sonido("Cancion 2", "sonidoDos"));
        listaSonidos.add(new Sonido("Cancion 3", "sonidoTres"));

        RecyclerView.Adapter adaptador = new AdaptadorSonidos(MainActivity.this, listaSonidos);
        rvLista.setAdapter(adaptador);


    }
}
