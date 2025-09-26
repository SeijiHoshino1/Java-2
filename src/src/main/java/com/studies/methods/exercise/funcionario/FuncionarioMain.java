package com.studies.methods.exercise.funcionario;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Ana";
        funcionario.idade = 25;
        funcionario.salarios = new double[] {1000, 2000, 3000};

        funcionario.imprimir();
        funcionario.calcularMediaSalario();
    }
}
