package com.studies.methods.test;

import com.studies.methods.domain.Estudante;
import com.studies.methods.domain.ImpressoraEstudantes;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();


        estudante01.nome = "Ana";
        estudante01.idade = 25;
        estudante01.sexo = 'F';

        estudante02.nome = "Carlos";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);

    }
}
