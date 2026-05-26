package souza.fernando.maratonajava.exercicios.Ex010;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(int i = 0; i < salario.length; i++){
            System.out.println(salario[i]);
        }
        mediaSalario();
    }

    public void mediaSalario(){
        double media = 0;
        for(int i = 0; i < salario.length; i++){
            media += salario[i];
        }
        media = media/salario.length;
        System.out.printf("A media salarial é: %.2f", media);

    }


}
