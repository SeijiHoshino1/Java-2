package com.studies.association.unidirectional.onetomany.test;

import com.studies.association.unidirectional.onetomany.domain.Jogador;
import com.studies.association.unidirectional.onetomany.domain.Time;

// Associação unidirecional um para muitos
public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
