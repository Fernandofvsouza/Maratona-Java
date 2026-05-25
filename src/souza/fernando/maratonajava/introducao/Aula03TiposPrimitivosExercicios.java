package souza.fernando.maratonajava.introducao;


import java.time.LocalDate;
import java.util.Date;

//Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
/*
* Eu <nome>, morando no endereço <endereço> confirmo que recebi
* o salario de <salario> na data <data>
* */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Fernando";
        String endereco = "rua das flores";
        double salario = 1200.00;
        LocalDate data = LocalDate.of(2026,10,11);

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salario de " + salario + " na data " + data);
    }
}
