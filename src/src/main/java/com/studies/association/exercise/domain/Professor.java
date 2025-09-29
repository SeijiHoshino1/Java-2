package com.studies.association.bidirectional.domain;

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

        if (seminarios != null) {
            System.out.println("-- Seminários cadastrados --");
            for (Seminario seminario : seminarios) {
                System.out.println(seminario.getTitulo());
                System.out.println(seminario.getLocal().getEndereco());
                System.out.println("-- Alunos cadastrados --");
                for (Aluno aluno : seminario.getAlunos()) {
                    System.out.println("Aluno:" + aluno.getNome() + "Idade:" + aluno.getIdade());
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
