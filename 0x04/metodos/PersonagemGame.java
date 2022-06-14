public class PersonagemGame {

    int quantidadeDeDano;

    int quantidadeDeCura;

    int saudeAtual;
    private String nome;

    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
    }

    public PersonagemGame() {
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PersonagemGame(int quantidadeDeDano, int quantidadeDeCura) {
        this.quantidadeDeDano = quantidadeDeDano;
        this.quantidadeDeCura = quantidadeDeCura;
    }

    public PersonagemGame(int quantidadeDeDano) {
        this.quantidadeDeDano = quantidadeDeDano;
    }

    public int getQuantidadeDeDano() {
        return quantidadeDeDano;
    }

    public void setQuantidadeDeDano(int quantidadeDeDano) {
        this.quantidadeDeDano = quantidadeDeDano;
    }

    public int getQuantidadeDeCura() {
        return quantidadeDeCura;
    }

    public void setQuantidadeDeCura(int quantidadeDeCura) {
        this.quantidadeDeCura = quantidadeDeCura;
    }

    public int tomarDano(int quantidadeDeDano) {
        int tomaDano = saudeAtual - quantidadeDeDano;
        return tomaDano;

    }

    public int receberCura(int quantidadeDeCura) {
        int recebeCura = saudeAtual + quantidadeDeCura;
        return recebeCura;
    }

}