public class Telefone {

    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.numero = numero;
        this.codigoArea = codigoArea;
    }

    @Override
    public String toString() {
        return "(" + codigoArea + ") " + numero;
    }


}
