package souza.fernando.maratonajava.exercicios.Ex010;

public class MainFuncionario {
    static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "Joao";
        f.idade = 20;
        f.salario = new double[]{1200, 987.32, 2000};
        f.imprimir();
        
    }
}
