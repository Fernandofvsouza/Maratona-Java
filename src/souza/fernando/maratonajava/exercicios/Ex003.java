package souza.fernando.maratonajava.exercicios;

public class Ex003 {
    public static void main(String[] args) {
        //Encontrar duplicados
        /*
        * Dado um array de inteiros, encontra e imprime
        * todos os valores que aparecem mais de uma vez, cada duplicado dever aparecer apaenas uma vez no output

        * */
        boolean existe;
        int[] valores = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        boolean[] duplicados = new boolean[valores.length];
        System.out.println("Valores duplicados:");
        for(int i = 0; i < valores.length; i++) {
                if(duplicados[i]) continue;
            for(int j = i + 1; j < valores.length; j++) {
                if(valores[i] == valores[j] && !duplicados[i]) {
                    System.out.println(valores[i]);
                    duplicados[i] = true;
                    duplicados[j] = true;
                }
            }
        }



    }
}
