package com.studies.methods.exercise.funcionario;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(double salario : salarios){
            System.out.println("Salário: " + salario);
        }
    }

    public void calcularMediaSalario() {
        double media = 0;
        for(double salario : salarios) {
            media += salario;
        }
        System.out.println("Média dos salários: " + media / salarios.length);
    }
}
