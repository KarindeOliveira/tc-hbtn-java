public class Livro extends Midia{

    private int edicao;

    public Livro(String nome, int quantidadeArtigos) {
        this.edicao = quantidadeArtigos;
        setNome(nome);
    }

    public int getQuantidadeArtigos() {
        return edicao;
    }

    public void setQuantidadeArtigos(int quantidadeArtigos) {
        this.edicao = quantidadeArtigos;
    }

    public Livro(String nome) {
        super(nome);
    }


}
