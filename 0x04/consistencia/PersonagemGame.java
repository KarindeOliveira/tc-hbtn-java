public class PersonagemGame {

    int quantidadeDeDano;

    int quantidadeDeCura;

    private String status;

    private int saudeAtual;
    private String nome;

    public PersonagemGame() {
    }

    public PersonagemGame(int quantidadeDeDano, int quantidadeDeCura) {
        this.quantidadeDeDano = quantidadeDeDano;
        this.quantidadeDeCura = quantidadeDeCura;
    }

    public PersonagemGame(String nome) {
        this.nome = nome;
    }

    public PersonagemGame(int quantidadeDeDano, String sonic) {
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

    public void setStatus(String status) {
        this.status = status;
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

    public String getStatus() {
        if(getSaudeAtual() == 0){
            status = "morto";
        }else{
            status = "vivo";
        }
        return status;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty() || nome.isBlank()){
            this.nome = "Sonic";}
    }

    public void tomarDano(int quantidadeDeDano) {
        int saude = getSaudeAtual() - quantidadeDeDano;
        if( saude <= 0){
            this.saudeAtual = 0;
        }else{
            this.saudeAtual = saude;
        }

    }

      public void receberCura(int quantidadeDeCura){
        int saude = getSaudeAtual() + quantidadeDeCura;
        if(saude >= 100){
            this.saudeAtual = 100;
        }else{
            this.saudeAtual = saude;
        }

    }
}