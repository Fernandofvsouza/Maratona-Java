package souza.fernando.maratonajava.exercicios.Ex008;

public class Gato extends Animal{
    private String raca;
    public Gato(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void apresentar(){
        System.out.println("Meu nome: " + getNome() + " Idade: " + getIdade() + " Raça: " + raca);
    }

    public void miar(){
        System.out.println("Miau");
    }
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
