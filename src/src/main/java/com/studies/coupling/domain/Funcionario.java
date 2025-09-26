package com.studies.coupling.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(double salario : salarios){
            System.out.println("Salário: " + salario);
        }
    }

    public double calcularMediaSalario() {
        double media = 0;
        for(double salario : salarios) {
            media += salario;
        }
        return media / salarios.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return calcularMediaSalario();
    }
}
