package souza.fernando.maratonajava.javacore.Bintroducaometodos.teste;

import souza.fernando.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraDoisNumeros();
        calculadora.multiplicaDoisNumeros(10,20);
    }
}
