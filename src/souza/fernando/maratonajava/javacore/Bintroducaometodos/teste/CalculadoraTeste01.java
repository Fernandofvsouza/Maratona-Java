package souza.fernando.maratonajava.javacore.Bintroducaometodos.teste;

import souza.fernando.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraDoisNumeros();
        calculadora.multiplicaDoisNumeros(10,20);
        calculadora.divideDoisNumeros(50,2); //Nao vai ter saida, precisamos atribuir a uma variavel
        double result = calculadora.divideDoisNumeros(50,2);
        System.out.println(result); //Ou
        System.out.println(calculadora.divideDoisNumeros(50,2));
    }
}
