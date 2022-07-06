public class Jornal extends Midia{

    private int quantidadeArtigos;

    public Jornal(String nome, int quantidadeArtigos) {
         this.quantidadeArtigos = quantidadeArtigos;
         setNome(nome);
    }

    public Jornal(String nome) {
        super(nome);
    }

    public int getQuantidadeArtigos() {
        return quantidadeArtigos;
    }

    public void setQuantidadeArtigos(int quantidadeArtigos) {
        this.quantidadeArtigos = quantidadeArtigos;
    }




}
