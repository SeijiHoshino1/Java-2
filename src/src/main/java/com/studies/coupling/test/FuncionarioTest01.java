package com.studies.coupling.test;

import com.studies.coupling.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Ana");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[] {1000, 2000, 3000});

        funcionario.imprimir();
        System.out.println("Média dos salários: " + funcionario.getMedia());
    }
}
