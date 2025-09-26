package com.studies.classes.test;

import com.studies.classes.domain.Estudante; // Importação da classe

public class EstudanteTest01 {
    public static void main (String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Seiji";
        estudante.idade = 25;
        estudante.sexo = 'M';
    }
}
