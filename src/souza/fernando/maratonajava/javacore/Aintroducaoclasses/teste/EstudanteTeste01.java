package souza.fernando.maratonajava.javacore.Aintroducaoclasses.teste;

import souza.fernando.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Joao";
        estudante.sexo = 'M';
        estudante.idade = 22;
        System.out.println(estudante.nome);
    }
}
