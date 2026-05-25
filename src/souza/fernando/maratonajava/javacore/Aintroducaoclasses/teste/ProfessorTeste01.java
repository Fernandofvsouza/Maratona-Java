package souza.fernando.maratonajava.javacore.Aintroducaoclasses.teste;

import souza.fernando.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Macedo";
        professor.sexo = 'M';
        professor.idade = 52;
        System.out.println("O professor se chama " +  professor.nome + " Do sexo " + professor.sexo + " Com a idade de: " + professor.idade + " anos");
    }
}
