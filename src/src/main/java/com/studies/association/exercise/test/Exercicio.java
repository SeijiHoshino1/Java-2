package com.studies.association.exercise.test;
import com.studies.association.exercise.domain.Aluno;
import com.studies.association.exercise.domain.Local;
import com.studies.association.exercise.domain.Professor;
import com.studies.association.exercise.domain.Seminario;

// Aluno 1 -- 1 Seminario
// Seminario 1 -- N Aluno
// Professor 1 -- N Seminario
// Seminario 1 -- 1 Local

public class Exercicio {
    public static void main(String[] args) {
        Local local = new Local("Unicesumar");
        Aluno aluno = new Aluno("Seiji", 25);
        Aluno[] alunosSeminarios = {aluno};
        Seminario seminario = new Seminario("Banco de dados", alunosSeminarios, local);
        Seminario[] seminarios = {seminario};
        Professor professor = new Professor("Carlos", "PostgreSQL", seminarios);

        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
