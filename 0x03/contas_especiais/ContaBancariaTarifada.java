import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual, int quantidadeTransacoes) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void sacar(double valor){
        double saldo = super.getSaldo();
        saldo = saldo - valor - 0.10;
        super.setSaldo(saldo);
        this.quantidadeTransacoes++;
    }

    @Override
    public void depositar(double valor){
        double saldo = super.getSaldo();
        saldo = saldo + valor - 0.10;
        super.setSaldo(saldo);
        this.quantidadeTransacoes++;
    }
}