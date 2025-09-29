package com.studies.association.bidirectional.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public void imprime() {
        System.out.println(this.nome);
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(Jogador[] jogadores) {
        this.jogadores = jogadores;

        if (jogadores != null) {
            for (Jogador j : jogadores) {
                j.setTime(this);
            }
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

