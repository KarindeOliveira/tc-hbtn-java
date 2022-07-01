import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Agencia(String nomeAgencia) {
        this.nome = nomeAgencia;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double valorIni){
        if(buscarCliente(nomeCliente) == null){
            this.clientes.add(new Cliente(nomeCliente, valorIni));
            return true;
        }else{
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nomeCLiente, double valorIni){

        if(buscarCliente(nomeCLiente) != null){
            buscarCliente(nomeCLiente).adicionarTransacao(valorIni);
            return true;
        }else{
            return false;
        }
    }



    public Cliente buscarCliente(String nomeCLiente){

        for (Cliente lista : this.clientes) {

            if(lista.getNome().equals(nomeCLiente)){
                return lista;

            }

        }
        return null;

    }



}
