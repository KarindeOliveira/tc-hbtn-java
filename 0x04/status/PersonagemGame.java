public class PersonagemGame {

    int quantidadeDeDano;

    int quantidadeDeCura;

    private String status;

    private int saudeAtual;
    private String nome;

    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
    }

    public PersonagemGame() {
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        if(getSaudeAtual() == 0){
            status = "morto";
        }else{
            status = "vivo";
        }
        return status;
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

    public void tomarDano(int quantidadeDeDano) {
        int saude = getSaudeAtual() - quantidadeDeDano;
        if( saude < 0){
            this.saudeAtual = 0;
        }else{
            this.saudeAtual = saude;
        }

    }

      public void receberCura(int quantidadeDeCura){
        int saude = getSaudeAtual() + quantidadeDeCura;
        if(saude > 100){
            this.saudeAtual = 100;
        }else{
            this.saudeAtual = saude;
        }

    }
}