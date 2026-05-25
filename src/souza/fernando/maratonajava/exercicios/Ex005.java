package souza.fernando.maratonajava.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        /*
        * Ordenação de numeros
        * * Receba vários números
         * Guarde em um ArrayList<Integer>
         * Mostre:
         * lista original
         * lista em ordem crescente
         * lista em ordem decrescente
        * */
        Random aleatorio = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            numeros.add(aleatorio.nextInt(100));
        }
        int opcao;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mostrar lista original");
            System.out.println("2 - Mostrar lista por ordem crescente");
            System.out.println("3 - Mostrar lista por ordem decrescente");
            System.out.println("0 - Sair");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    for(int i = 0; i < numeros.size(); i++){
                        System.out.println(numeros.get(i));
                    }
                    break;
                case 2:
                    Collections.sort(numeros);
                    System.out.println("Lista em ordem crescente");
                    for (int i = 0; i < numeros.size(); i++){
                        System.out.println(numeros.get(i));
                    }
                    break;
                case 3:
                    Collections.sort(numeros,  Collections.reverseOrder());
                    System.out.println("Lista em ordem decrescente");
                    for (int i = 0; i < numeros.size(); i++){
                        System.out.println(numeros.get(i));
                    }
            }
        }while(opcao != 0);

    }
}
