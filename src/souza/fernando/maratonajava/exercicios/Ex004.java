package souza.fernando.maratonajava.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex004 {
    static ArrayList<String> alunos = new ArrayList<>();
    public static void adicionarAlunos(){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome completo do aluno:");
            String nomeAluno = input.nextLine();
            alunos.add(nomeAluno);
            System.out.println("Aluno adicionado com sucesso!");

    }
    public static void listarAlunos(){
        for(String aluno: alunos){
            System.out.println(aluno);
        }
    }
    public static void removerAluno(){
        String nomeAluno;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome completo do aluno a ser removido:");
        nomeAluno = input.nextLine();
        nomeAluno = nomeAluno.trim().toLowerCase();
        if(alunos.contains(nomeAluno)){
            alunos.remove(nomeAluno);
            System.out.println("Aluno removido com sucesso!");
        }
        else{
            System.out.println("Não foi possível encontrar o aluno para remoção!");
        }

    }
    public static void buscarAluno(){
        String nomeAluno;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome completo do aluno:");
        nomeAluno = input.nextLine();
        nomeAluno.trim().toLowerCase();
        if(alunos.contains(nomeAluno)){
            System.out.println("Aluno encontrado: " + nomeAluno);
        }
        else{
            System.out.println("Não foi possível encontrar o aluno!");
        }
    }
    static void main(String[] args) {
        /*
        * Cadastro de alunos
        * - adicionar aluno
        * - listar alunos
        * - remover aluno
        * - buscar aluno pelo nome
        * */
        Scanner input = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        int opcao;
        do{
            System.out.println("Cadastro de alunos:");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Remover aluno");
            System.out.println("4 - Buscar aluno pelo nome");
            System.out.println("0 - Sair");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                     adicionarAlunos();
                     break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    removerAluno();
                    break;
                case 4:
                    buscarAluno();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }while(opcao != 0);

    }
}
