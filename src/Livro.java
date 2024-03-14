// Classe de modelagem

public class Livro {

    // --- ATRIBUTOS ---
    //+ (public) TipoDeDado nomeAtributoOuVariavel
    public String titulo;
    public String autor;
    public double valor;
    public String editora;
    public int paginas;
    public String resumo;
    public String tipoCapa;


    // --- MÉTODOS ---

    public String exibirDados(){
        return "Meu livro favorito é: " + titulo + ";\nSeu autor é: "
                + autor + ";\nSeu preço é: R$"
                + valor + ".";
    }
}
