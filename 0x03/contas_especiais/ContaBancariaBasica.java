import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public String getNumeracao() {
        return numeracao;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        saldo = 0;
    }

   public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor > 0){
            this.saldo = this.saldo + valor;
        }else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
   }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0 ) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

    }

    double calcularTarifaMensal(){
        double tarifa = 0;
        tarifa = this.saldo * 0.1;
        if(tarifa < 10){
            return tarifa;
        }else{
            return 10;
        }
    }

    public double calcularJurosMensal(){
        if(getSaldo()< 0){
            return 0;
        }
        return getSaldo() * ((getTaxaJurosAnual() / 12) / 100);
    }

    public void aplicarAtualizacaoMensal(){
        this.saldo = this.saldo + calcularJurosMensal() - calcularTarifaMensal();

    }


}
