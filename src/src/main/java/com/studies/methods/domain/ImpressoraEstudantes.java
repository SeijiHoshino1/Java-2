package com.studies.methods.domain;

public class ImpressoraEstudantes {
    // Criado com o intuito de deixar o código com alta coesão
    public void imprimir(Estudante estudante) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Nome: " + estudante.nome + " \nIdade: " + estudante.idade + " \nSexo: " + estudante.sexo);
    }
}
