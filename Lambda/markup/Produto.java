import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10;
    public Supplier<Double> precoComMarkup = () -> this.preco * (this.preco *percentualMarkup/100);
    public Consumer<Double> atualizarMarkup = (Double valor) -> this.percentualMarkup = valor;

    public Produto(double valor, String nome) {
        this.nome = nome;
        this.preco = valor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

    public Supplier<Double> getPrecoComMarkup() {
        return precoComMarkup;
    }

    public void setPrecoComMarkup(Supplier<Double> precoComMarkup) {
        this.precoComMarkup = precoComMarkup;
    }

    public Consumer<Double> getAtualizarMarkup() {
        return atualizarMarkup;
    }

    public void setAtualizarMarkup(Consumer<Double> atualizarMarkup) {
        this.atualizarMarkup = atualizarMarkup;
    }
}
