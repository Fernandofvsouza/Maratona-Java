package souza.fernando.maratonajava.exercicios.Ex006;

public class Main {
    static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Mustang", 2018);
        Carro carro2 = new Carro("Lamborghini", "Urus", 2025);

        System.out.println("Carro 1: " + carro1.getMarca() + " " + carro1.getModelo() + " " + carro1.getAno());

    }
}
