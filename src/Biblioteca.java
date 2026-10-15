public class Biblioteca {
    private Livro[] livros;
    private int quantidade=0;
    public Biblioteca(int capacidade){
        this.livros = new Livro[capacidade];}
    public void adicionarLivro(Livro livro){
        if(quantidade < livros.length){
            livros[quantidade]= livro;
            quantidade++;

        }
        else{
            throw new IllegalArgumentException("A Biblioteca" + livros.length + "está cheia");
        }
    }

}
