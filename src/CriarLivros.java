// Classe de execução

public class CriarLivros {
    public static void main(String[] args) {
        // Instanciando um objeto => criar o objeto na memória

        //   tipoObjeto   nomeObjeto = operadorInstanciação  método construtor;
        //     Livro       favorito  =         new                Livro();

        Editora editoraHobbit = new Editora();
        editoraHobbit.nome = "Thomas Nelson";
        editoraHobbit.representante = "João";

        Editora editoraHarryPotter = new Editora();
        editoraHarryPotter.nome = "Rocco";
        editoraHarryPotter.representante = "Maria";


        Livro favorito = new Livro("O Hobbit");
        //favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Talkien";
        favorito.valor = 30.90;
        favorito.editora = editoraHobbit;
        favorito.paginas = 400;
        favorito.resumo = "Bilbo era um dos...";
        favorito.tipoCapa = "COMUM";

        System.out.println(favorito.exibirDados());

        Livro meuLivro = new Livro("Harry Potter e a Pedra Filosofal");
        //meuLivro.titulo = "Harry Potter e a Pedra Filosofal";
        meuLivro.autor = "J. K. Rowling";
        meuLivro.valor = 44.70;
        meuLivro.editora = editoraHarryPotter;
        meuLivro.paginas = 264;
        meuLivro.resumo = "Harry Potter... ";
        meuLivro.tipoCapa = "DURA";

        System.out.println(meuLivro.exibirDados());
    }
}
