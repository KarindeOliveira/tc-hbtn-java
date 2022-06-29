import java.util.*;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> lista;


    public ListaTelefonica() {
        this.lista = new HashMap<>();
    }

 
    public HashSet<Telefone>  buscar(String nome){

        for (String lista : this.lista.keySet() ) {

            if(lista.equals(nome)){
                return this.lista.get(lista);

            }

        }
        return null;

    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){

            HashSet<Telefone> numeroTel;
            numeroTel = lista.get(nome);
            if(numeroTel==null){
                numeroTel = new HashSet<Telefone>();
            }
            if(numeroTel.contains(telefone)){
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }
            Iterator<HashSet<Telefone>> telefones = lista.values().iterator();
            while (telefones.hasNext()){
                for(Telefone tel : telefones.next()){
                    if(tel.equals(telefone)){
                        throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                    }
                }
            }

            numeroTel.add(telefone);
            this.lista.put(nome,numeroTel);
            return numeroTel;
        }




    }





