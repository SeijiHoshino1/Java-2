package com.studies.classes.domain;

public class Pessoa {
    // Atributos (características)
    String nome;
    int idade;

    // Construtor (metodo especial para criar objetos)
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Metodo (ação)
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
