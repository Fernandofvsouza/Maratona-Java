package souza.fernando.maratonajava.exercicios.Ex009;

public class Main {
    static void main(String[] args) {
        Produto produto = new Produto("Amaciante downy", 20.50, 500);
        produto.vender(100);
        System.out.println("Estoque atual: " + produto.getEstoqueProduto());
        produto.repor(350);
        System.out.println("Estoque atual: " + produto.getEstoqueProduto());
    }
}
