public class App {
    public static void main(String[] args) {
        Livro teste = new Livro("O Hobbit", "J. R. R. Tolkien");
        System.out.println("Título: " + teste.getTitulo());
        System.out.println("Autor: " + teste.getAutor());
        System.out.println("Disponível: " + teste.isDisponivel());
    }
}
