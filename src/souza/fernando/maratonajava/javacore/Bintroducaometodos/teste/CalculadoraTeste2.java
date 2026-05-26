package souza.fernando.maratonajava.javacore.Bintroducaometodos.teste;

import souza.fernando.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste2 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 5;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
