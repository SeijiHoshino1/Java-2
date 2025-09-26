package com.studies.coupling.test;

import com.studies.coupling.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ana");
        pessoa.setIdade(25);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
