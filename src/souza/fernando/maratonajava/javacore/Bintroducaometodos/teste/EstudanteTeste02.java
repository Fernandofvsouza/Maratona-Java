package souza.fernando.maratonajava.javacore.Bintroducaometodos.teste;

import souza.fernando.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.sexo = 'M';
        estudante01.idade = 15;

        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';
        estudante02.idade = 20;

        estudante01.imprime();
        estudante02.imprime();
    }
}
