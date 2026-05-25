package souza.fernando.maratonajava.exercicios;

public class Ex002 {
    //Inverter um array
    /*
    * Dado um array de strings inverte a ordem dos elementos
    * sem usar metodos prontos. o resultado deve ser um novo array
    * */
    static void main(String[] args) {
        String[] nome = {"Fernando", "Ana", "Lola", "Joao"};
        String[] nome2 = new String[4];
        for(int i = 0; i < nome.length; i++) {
            nome2[nome.length - 1 - i] = nome[i];
        }
        for(int i = 0; i < nome2.length; i++) {
            System.out.println(nome2[i]);
        }
    }
}
