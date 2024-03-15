// Classe de modelagem

public class Livro {

    // <--- ATRIBUTOS --->
    //+ (public) TipoDeDado nomeAtributoOuVariavel
    public String titulo;
    public String autor;
    public double valor;
    public String editora;
    public int paginas;
    public String resumo;
    public String tipoCapa;

    // <--- MÉTODOS --->

    public String exibirDados(){
        return "-------------------------" +
                "\nTítulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nPreço: R$" + this.valor +
                "\nEditora: " + this.editora +
                "\nPáginas: " + this.paginas +
                "\nResumo: " + this.resumo +
                "\nTipo de Capa: " + this.tipoCapa;
    }
}
