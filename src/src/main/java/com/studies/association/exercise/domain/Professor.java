package com.studies.association.exercise.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("------ Professor -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade + "\n");

        if (seminarios != null) {
            System.out.println("-- Seminários cadastrados --");
            for (Seminario seminario : seminarios) {
                System.out.println("Titulo: " + seminario.getTitulo());
                System.out.println("Local: " + seminario.getLocal().getEndereco() + "\n");
                if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {continue;}
                System.out.println("-- Alunos cadastrados --");
                for (Aluno aluno : seminario.getAlunos()) {
                    aluno.imprime();
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
