public class Gerente extends Empregado{

    private double salarioFixo;

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public Gerente(double valorMeta, double valorAtingidoMeta, double salarioFixo) {
        super(valorMeta, valorAtingidoMeta, salarioFixo);
    }

    @Override
    public double getSalarioFixo() {
        return super.getSalarioFixo();
    }

    @Override
    public double calcularBonus(Departamento departamento){
        double bonus = 0;
        if (departamento.alcancouMeta()) {
            bonus = super.getSalarioFixo() * 0.2;
            double bonus1 = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            bonus1 = bonus1 * 0.01;
            bonus = bonus + bonus1;
        }
        return bonus;

    }
}
