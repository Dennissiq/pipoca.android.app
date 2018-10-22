package br.com.dennissiqueira.pipoca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import br.com.dennissiqueira.pipoca.DetalheFilme;
import br.com.dennissiqueira.pipoca.Filme;
import br.com.dennissiqueira.pipoca.FilmeArrayAdapter;
import br.com.dennissiqueira.pipoca.MainActivity;
import br.com.dennissiqueira.pipoca.R;

public class ListaFilmes extends AppCompatActivity {

    public static final String FILME = "br.com.dennissiqueira.pipoca";
    Activity atividade;
    Filme filme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);

        atividade = this;
        filme = new Filme();

        Intent intent = getIntent();
        String genero = intent.getStringExtra(MainActivity.CHAVE);
        ListView listView = (ListView) findViewById(R.id.lista_filmes);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, filme.getListaNomes(genero));
        FilmeArrayAdapter adapter = new FilmeArrayAdapter(this, filme.getFilmesPorGenero(genero));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(atividade, DetalheFilme.class);
                intent.putExtra(FILME, filme.getList().get(position).getTitulo());
                startActivity(intent);
            }
        });
    }
}