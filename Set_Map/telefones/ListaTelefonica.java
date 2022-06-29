import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> lista;

    public ListaTelefonica() {
        this.lista = new HashMap<>();;
    }



    public ArrayList<Telefone> buscar(String nome){

        for (String lista : this.lista.keySet() ) {

            if(lista.equals(nome)){
                return this.lista.get(lista);

            }

        }
        return null;

    }

    public void adicionarTelefone(String nome, Telefone telefone){
        if(buscar(nome) != null){
            this.lista.get(nome).add(telefone);
        }else{
            ArrayList<Telefone> lista = new ArrayList<Telefone>();
            lista.add(telefone);
            this.lista.put(nome,lista);

        }


    }



    }

