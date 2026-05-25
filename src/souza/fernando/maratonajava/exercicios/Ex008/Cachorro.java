package souza.fernando.maratonajava.exercicios.Ex008;

public class Cachorro extends Animal {
    private String raca;
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void apresentar(){
        System.out.println("Meu nome: " + getNome() + " Idade: " + getIdade() + " Raça: " + raca);
    }

    public void latir(){
        System.out.println("Au au au au");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
