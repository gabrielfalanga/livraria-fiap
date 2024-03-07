// Classe de execução

public class CriarLivros {
    public static void main(String[] args) {
        // Instanciando um objeto => criar o objeto na memória
        //   tipoObjeto   nomeObjeto = operadorInstanciação  construtor;
        //     Livro       favorito  =         new             Livro();
        Livro favorito = new Livro();
        favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Talkien";
        favorito.valor = 37.27;
        favorito.editora = "Harper Collins";
        favorito.resumo = "Bilbo era um dos...";
        favorito.tipoCapa = "COMUM";

        System.out.println("Meu livro favorito é: " + favorito.titulo
                + ";\nSeu autor é: " + favorito.autor + ";\nSeu preço é: R$"
                + favorito.valor + ".");

        Livro meuLivro = new Livro();
        meuLivro.titulo = "Harry Potter e a Pedra Filosofal";
        meuLivro.autor = "J. K. Rowling";
        meuLivro.valor = 58.98;

        System.out.println("\nO livro que estou lendo é: " + meuLivro.titulo
                + ";\nSeu autor é: " + meuLivro.autor + ";\nSeu preço é: R$"
                + meuLivro.valor + ".");

    }
}
