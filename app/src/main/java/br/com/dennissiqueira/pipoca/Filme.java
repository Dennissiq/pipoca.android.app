package br.com.dennissiqueira.pipoca;

import android.support.annotation.NonNull;

import java.io.Serializable;

public class Filme implements Serializable, Comparable {

    private String nome;
    private String genero;

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public int compareTo(@NonNull Object o) {
        return 0;
    }
}
