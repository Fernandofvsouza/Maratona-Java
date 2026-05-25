package souza.fernando.maratonajava.exercicios;

import java.util.Random;

public class Ex001 {
    static void main(String[] args) {
        //SOMA E MEDIA DOS ELEMENTOS
        //Cria um array de 5 inteiros a tua escolha. calcula e imprime a soma total e a media dos valor
        Random rand = new Random();
        int[] numeros = {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];

        }
        int media = soma / 5;
        System.out.println(soma);
        System.out.println(media);
    }
}
