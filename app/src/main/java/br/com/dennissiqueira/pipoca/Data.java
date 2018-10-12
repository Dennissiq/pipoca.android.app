package br.com.dennissiqueira.pipoca;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.dennissiqueira.pipoca.Filme;


public class Data {

    public static ArrayList<String> listarNomes(ArrayList<Filme> filmes){
        ArrayList<String> nomes = new ArrayList<>();
        for (Filme filme : filmes) {
            nomes.add(filme.getNome());
        }
        return nomes;
    }
    public static ArrayList<Filme> listarFilmes(String genero) {
        Filme[] lista;
        ArrayList<Filme> filmes = new ArrayList<>();
        for (Filme filme : todosFilmes()) {
            if (filme.getGenero().equals(genero) || genero.equals("Todos")) {
                filmes.add(filme);
            }
        }

        lista = filmes.toArray(new Filme[0]);

        Arrays.sort(lista);

        filmes = new ArrayList<>();
        for(int i = 0; i < lista.length; i++) {
            filmes.add(lista[i]);
        }
        return filmes;
    }

    private static ArrayList<Filme> todosFilmes() {

        ArrayList<Filme> filmes = new ArrayList<>();
        Filme filme;

        filme = new Filme();
        filme.setNome("O Iluminado");
        filme.setGenero("Horror");
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("Poderoso Chefão");
        filme.setGenero("Fantasia");
        filmes.add(filme);

        return filmes;

    }
}

