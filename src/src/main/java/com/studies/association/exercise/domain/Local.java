package com.studies.association.exercise.domain;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
