package com.example.prct006_interfacedoutilizador2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Criando a coleção de 10 itens manualmente do Array do tipo String..
        String[] lista = new String[]{
                "Formando 1",
                "Formando 2",
                "Formando 3",
                "Formando 4",
                "Formando 5",
                "Formando 6",
                "Formando 7",
                "Formando 8",
                "Formando 9",
                "Formando 10"
        };

        // Associando o array à ListView do layout, mas primeiramente é necessário declarar
        //um adapter que associa a lista ao formato de layout,para isso, será utilizado o padão de
        // exibição de listas do android Studio. (simple_list_view)

        ListAdapter adapter; // Criando um objeto do tipo ListaAdapter, caso tenhamos mais itens do que podem caber no
        //ecrã, o sistems irá se adaptar automáticamente, de acordo com a capacidade do mesmo.
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);

        // Agora ligamos o nosso Adapter com a nossa vista.
        ListView listView =  findViewById(android.R.id.list);
        listView.setAdapter(adapter);

        // Criando o click de cada item do Array da Lista.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListAdapter la = (ListAdapter) parent.getAdapter();
                String texto = (String) la.getItem(position);
                Toast.makeText(view.getContext(),texto,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
