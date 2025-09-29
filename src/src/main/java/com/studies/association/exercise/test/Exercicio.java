package com.studies.association.bidirectional.test;

// Aluno 1 -- 1 Seminario
// Seminario 1 -- N Aluno
// Professor 1 -- N Seminario
// Seminario 1 -- 1 Local

import com.studies.association.bidirectional.domain.Aluno;
import com.studies.association.bidirectional.domain.Local;
import com.studies.association.bidirectional.domain.Professor;
import com.studies.association.bidirectional.domain.Seminario;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Local local = new Local("Unicesumar");
        Aluno aluno = new Aluno("Seiji", 25);
        Aluno[] alunosSeminarios = {aluno};
        Seminario seminario = new Seminario("Banco de dados", local);
        Seminario[] seminarios = {seminario};
        Professor professor = new Professor("Carlos", "DB", seminarios);

        professor.setSeminarios(seminarios);


    }
}
