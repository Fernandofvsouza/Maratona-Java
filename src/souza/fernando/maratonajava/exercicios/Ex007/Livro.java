package souza.fernando.maratonajava.exercicios.Ex007;

public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int totalPaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
    }

    public void abrir(){
        System.out.println("Abriu livro");
    }
    public void fechar(){
        System.out.println("Fechou livro");
    }
    public void avancarPagina(){
        paginaAtual = paginaAtual + 1;
        System.out.println("Avançou para a página " + paginaAtual);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
}
