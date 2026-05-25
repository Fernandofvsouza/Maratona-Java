package souza.fernando.maratonajava.exercicios.Ex009;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int estoqueProduto;

    public Produto(String nomeProduto, double precoProduto, int estoqueProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.estoqueProduto = estoqueProduto;
    }
    public void vender(int quantidade){
        if(estoqueProduto > quantidade){
            estoqueProduto -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        }else{
            System.out.println("Não há estoque suficiente para realizar a venda.");
        }

    }
    public void repor(int quantidade){
        estoqueProduto += quantidade;
        System.out.println("Estoque total: " + getEstoqueProduto());
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }
}
