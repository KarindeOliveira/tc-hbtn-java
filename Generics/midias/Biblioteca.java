import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> extends Midia{

    private List<T> list;

    public Biblioteca() {
        this.list = new ArrayList<T>();
    }

    public void adicionarMidia(T midia){
        this.list.add(midia);
    }

    public List<T> obterListaMidias(){
        return this.list;

    }


}
