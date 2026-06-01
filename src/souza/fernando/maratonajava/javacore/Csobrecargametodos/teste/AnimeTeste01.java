package souza.fernando.maratonajava.javacore.Csobrecargametodos.teste;

import souza.fernando.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Akudama drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);

        anime.imprime();
    }
}
