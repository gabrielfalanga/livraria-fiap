// Classe de modelagem

public class Livro {

    // <--- ATRIBUTOS --->
    //+ (public) TipoDeDado nomeAtributoOuVariavel
    public String titulo;
    public String autor;
    public double valor;
    public Editora editora;
    public int paginas;
    public String resumo;
    public String tipoCapa;

    // <--- MÉTODOS --->

    public String exibirDados(){
        return "-------------------------" +
                "\nTítulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nPreço: R$" + this.valor +
                "\nEditora: " + this.editora.nome +
                "\nPáginas: " + this.paginas +
                "\nResumo: " + this.resumo +
                "\nTipo de Capa: " + this.tipoCapa;
    }

    // <--- método construtor --->   pode ter mais de um

    public Livro(String titulo){
        this.titulo = titulo;
    }
}
