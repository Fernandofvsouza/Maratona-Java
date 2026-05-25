package souza.fernando.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
    //tipos primitivos: int, double, char, boolean, long, float, byte, short
        byte numeroPequeno = 100; // Size: 1 byte  -128 to 127  default value: 0;
        short numeroPequeno2 = 2000; //size 2 bytes  -32768 to 32767  default value: 0;
        int idade = 20; //Size 4 bytes  -2,147,483,648 to 2,147,483,647  default value: 0;
        long numeroGrande = 100000000000000L; //Size 8 bytes  -9,233,372,036,854,775,808 to 9223372036854750000 default value: 0;
        float numeroDecimal = 20.0f; //Size 4 bytes  3.4e-038 to 3.4e+038 default value: 0.0f
        double temperatura = 20.0; //Size: 8 bytes   1.7e-308 to 1.7e+038  default value: 0.0d
        boolean estado = true; //size 1 bit  ture or false  default value: false
        char sexo = 'M'; // 2 bytes                         default value: \u0000;
        System.out.println("Idade: " + idade);


        //------------------------------------------------------------------------------------
        //String não é um tipo primitivo, e sim um tipo de referencia Wrapper
        String nome = "Fernando";
        System.out.println("Nome: " + nome);
    }
}
