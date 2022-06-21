public class Empregado extends Departamento{

    private double salarioFixo;


    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double valorMeta, double valorAtingidoMeta) {
        super(valorMeta, valorAtingidoMeta);
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Empregado(double valorMeta, double valorAtingidoMeta, double salarioFixo) {
        super(valorMeta, valorAtingidoMeta);
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            return 0.1 * this.salarioFixo;
        }else {
            return 0;
        }
    }
    double calcularSalarioTotal(Departamento departamento){
      return calcularBonus(departamento) + getSalarioFixo();}
    

}
