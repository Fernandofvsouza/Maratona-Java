package souza.fernando.maratonajava.javacore.Bintroducaometodos.teste;

import souza.fernando.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import souza.fernando.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.sexo = 'M';
        estudante01.idade = 15;

        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';
        estudante02.idade = 20;

        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);
        System.out.println("------------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);
        System.out.println("------------------");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
