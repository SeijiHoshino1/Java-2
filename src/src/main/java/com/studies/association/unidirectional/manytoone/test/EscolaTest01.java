package com.studies.association.unidirectional.manytoone.test;

import com.studies.association.unidirectional.manytoone.domain.Escola;
import com.studies.association.unidirectional.manytoone.domain.Professor;

// Associação unidirecional muitos para um
public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Danilo");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Cesumar", professores);

        escola.imprime();

    }
}
