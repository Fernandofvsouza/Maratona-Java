package souza.fernando.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
       //While, do while, for

        //While
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count++;
        }

        //do while
        System.out.println("------------------------------");
        count = 0;
        do{
            System.out.println(count);
            count++;
        }while(count < 10);
        System.out.println("------------------------------");
        //for
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }


    }

}
