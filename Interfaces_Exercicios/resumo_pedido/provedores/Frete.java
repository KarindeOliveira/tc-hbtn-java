package provedores;

public class Frete {
    private TipoProvedorFrete tipoProvedorFrete;
    private double valor;

    public Frete(TipoProvedorFrete tipoProvedorFrete, double valor) {
        this.tipoProvedorFrete = tipoProvedorFrete;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }
}