package com.studies.association.exercise.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this(titulo, local);
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("---- Seminario ----");
        System.out.println("Titulo: " + titulo);
        System.out.println("Local: " + local);
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                System.out.println("Aluno: " + aluno);
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
