package com.studies.classes.test;

import com.studies.classes.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 25); // cria objeto
        Pessoa p2 = new Pessoa("Carlos", 30);

        p1.apresentar();
        p2.apresentar();
    }
}
