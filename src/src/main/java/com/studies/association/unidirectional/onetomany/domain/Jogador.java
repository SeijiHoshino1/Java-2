package com.studies.association.unidirectional.onetomany.domain;

// Associação unidirecional um para muitos
public class Jogador {
    private String nome;
    private Time time; // Associação do jogador com Time

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        if (time != null) {
            System.out.println("Time: " + time.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
