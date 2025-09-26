package com.studies.constructor.test;

import com.studies.constructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 5, "Ação", "Studio IG");

        anime.imprimir();
    }
}
