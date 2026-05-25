package souza.fernando.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    static void main(String[] args) {
        //Usando o break para parar um loop
        //Imprimindo os primeiros 25 numeros de 100
        for(int i = 0; i < 100; i++){

            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
