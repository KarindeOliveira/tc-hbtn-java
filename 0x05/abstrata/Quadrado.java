public class Quadrado extends Retangulo{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if( largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else{ this.lado = lado;
            this.altura = lado;
            this.largura = lado;}}

        @Override
        public String toString(){
            return String.format("[Quadrado] %.2f",getLado());
        }

}
