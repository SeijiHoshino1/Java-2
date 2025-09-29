package com.studies.inheritance.test;

import com.studies.inheritance.domain.Endereco;
import com.studies.inheritance.domain.Funcionario;
import com.studies.inheritance.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setEndereco("Rua 01");
        endereco.setCep("423432-43");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rodrigo Turini");
        pessoa.setCpf("42.42.42.42");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sara");
        funcionario.setCpf("234.234.541-23");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1500);

        funcionario.imprime();
    }
}
