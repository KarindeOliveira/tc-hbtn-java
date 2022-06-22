public class ContaBancariaControlada extends ContaBancariaBasica{

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }
    @Override
    public void aplicarAtualizacaoMensal(){
        if(saldoMinimo <= 0 || super.getSaldo() < saldoMinimo){
            double valor = super.getSaldo() + calcularJurosMensal() - calcularTarifaMensal() - this.valorPenalidade;
            super.setSaldo(valor);
        }else{
        double valor2 = super.getSaldo() + calcularJurosMensal() - calcularTarifaMensal();
        super.setSaldo(valor2);

    }
}}
