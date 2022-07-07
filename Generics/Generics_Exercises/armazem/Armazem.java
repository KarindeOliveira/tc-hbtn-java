import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> armazenados = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        armazenados.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return armazenados.get(nome);
    }
}