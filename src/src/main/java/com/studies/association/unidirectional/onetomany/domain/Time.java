package com.studies.association.unidirectional.onetomany.domain;

// Associação unidirecional um para muitos
public class Time {
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
