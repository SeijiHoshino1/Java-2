package com.studies.association.onetomany.test;

import com.studies.association.onetomany.Jogador;

// Associação unidirecional um para muitos
public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romario");
        Jogador jogador03 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
