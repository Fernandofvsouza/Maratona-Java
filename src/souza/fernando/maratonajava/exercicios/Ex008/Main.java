package souza.fernando.maratonajava.exercicios.Ex008;

public class Main {
    static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Olivia", 5, "Yorkshire");
        Gato gato = new Gato("Maju", 6, "Europeus comuns");
        cachorro.dormir();
        gato.comer();
        cachorro.latir();
        gato.miar();
        cachorro.apresentar();
        gato.apresentar();
    }
}
