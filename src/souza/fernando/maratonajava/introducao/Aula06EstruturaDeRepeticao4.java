package souza.fernando.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturaDeRepeticao4 {
    static void main(String[] args) {
       //Dado o valor de um carro, descubra de quantas vezes ele pode ser parcelado
        //Condição: valorParcela >= 1000
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do carro: ");
        double valorCarro = input.nextDouble();

        for(int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela >= 1000){
                System.out.printf("Parcela %d R$ %.2f%n", parcela, valorParcela);
            }else{
                break;
            }

        }




    }
}
