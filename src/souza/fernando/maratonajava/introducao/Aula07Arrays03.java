package souza.fernando.maratonajava.introducao;

public class Aula07Arrays03 {
    static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        //For each
        for(int num : numeros){
            System.out.println(num);
        }

        String[] nomes = new String[3];
        nomes[0] = "Juan";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";
        for(String nome : nomes){
            System.out.println(nome);
        }


    }
}
