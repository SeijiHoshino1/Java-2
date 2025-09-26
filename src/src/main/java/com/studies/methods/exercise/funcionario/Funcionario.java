package com.studies.methods.exercise;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void dadosFuncionario() {
        this.nome = "Seiji";
        this.idade = 25;
    }

    public void calcularSalario(int... salario) {
        double media = 0;
        for(double sal : salario){
            media += sal;
        }
    }
}
