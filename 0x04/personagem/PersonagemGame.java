public class PersonagemGame {

    int saudeAtual;
    String nome;

    public PersonagemGame(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public PersonagemGame(String nome) {
        this.nome = nome;
    }

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
}