import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Agencia(String nome, ArrayList<Cliente> clientes) {
        this.nome = nome;
        this.clientes = clientes;
    }

    public Agencia(String nome) {
        this.nome = nome;
    }

    public Agencia(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nome, double valorIni){
        if(buscarCliente(nome) == null){
            this.clientes.add(new Cliente(nome, valorIni));
            return true;
        }else{
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nomeCLiente, double valorIni){

        if(buscarCliente(nome) != null){
            buscarCliente(nome).adicionarTransacao(valorIni);
            return true;
        }else{
            return false;
        }
    }



    public Cliente buscarCliente(String nome){

        for (Cliente lista : this.clientes) {

            if(lista.getNome().equals(nome)){
                return lista;

            }

        }
        return null;

    }



}
