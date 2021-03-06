import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int codigo;
    List<Produto> produtos = new ArrayList<>();
    private Cliente cliente;
    private String vitinho;


    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public Pedido(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        return "[" + this.codigo + "]" + " " + this.cliente.getNome();
    }
}
