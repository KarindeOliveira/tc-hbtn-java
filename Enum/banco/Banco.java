import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nomeBanco) {
        this.nome = nomeBanco;
        agencias = new ArrayList<Agencia>();
    }
    public Agencia buscarAgencia(String nome){

        for (Agencia lista : this.agencias) {

            if(lista.getNome().equals(nome)){
                return lista;

            }

        }
        return null;

    }



    public boolean adicionarAgencia(String nome){
        if(buscarAgencia(nome) != null){
            return false;
        }else{
            this.agencias.add(new Agencia(nome));
            return true;
        }
    }


    public boolean adicionarCliente(String nome, String cliente, double valorIni){
        Agencia agencia =  buscarAgencia(nome);
        if(agencia.buscarCliente(cliente) == null){
            agencia.novoCliente(cliente,valorIni);
            adicionarAgencia(nome);
            return true;
        }else{
            return false;
        }
    }



    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCLiente, double valorIni){

        Agencia agencia = buscarAgencia(nomeAgencia);
        if((agencia.buscarCliente(nome) != null) && (buscarAgencia(nomeAgencia) != null)){
            return agencia.adicionarTransacaoCliente(nomeCLiente, valorIni);
            }else{
            return false;
        }
    }





    public boolean listarClientes(String nomeAgencia, boolean imprime){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if(agencia != null) {
            int posicao = 0;
            for (Cliente cliente : agencia.getClientes()) {
                posicao++;
                System.out.println("Cliente: " + cliente.getNome() + " [" + (posicao) + "]");
                if (imprime == true) {
                    int posicaoTransacao = 0;
                    for (double transacao : cliente.getTransacoes()) {
                        posicaoTransacao++;
                        System.out.println("  [" + posicaoTransacao + "] valor " + transacao);
                    }
                }
            }
            return true;
        }
        else{
            return false;
        }
    }}