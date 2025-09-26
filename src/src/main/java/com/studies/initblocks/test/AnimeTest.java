package com.studies.initblocks.test;

import com.studies.initblocks.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.println("EP: " + episodio);
        }
    }
}
