public class Produto {

   private int codigo;
   private String nome;
   private CategoriaProduto categoria;
   private Double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[" + this.codigo + "]" + " " + this.nome  + " " + this.categoria + " " + "R$" + " " + String.format("%.2f",preco);
    }
}
