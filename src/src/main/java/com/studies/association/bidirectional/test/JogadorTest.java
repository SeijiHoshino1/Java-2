package com.studies.association.bidirectional.test;

import com.studies.association.bidirectional.domain.Jogador;
import com.studies.association.bidirectional.domain.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Time time = new Time("Brasil");
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("------- Jogadores -------");
        for (Jogador j : jogadores) {
            j.imprime();
        }
        System.out.println("------- Time -------");
        time.imprime();
    }
}
