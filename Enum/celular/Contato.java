public class Contato {

    private String nome;
    private String numTel;
    private TipoNumero tipoNumero;

    public Contato(String nome, String numTel, TipoNumero tipoNumero) {
        setNome(nome);
        setNumTel(numTel);
        setTipoNumero(tipoNumero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }
}
