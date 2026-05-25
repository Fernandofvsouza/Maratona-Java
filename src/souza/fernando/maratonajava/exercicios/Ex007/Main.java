package souza.fernando.maratonajava.exercicios.Ex007;

public class Main {
    static void main() {
        Livro livro1 = new Livro("As intermitencias da morte", "José Saramago", 200, 120);
        livro1.abrir();
        livro1.fechar();
        livro1.avancarPagina();
    }
}
