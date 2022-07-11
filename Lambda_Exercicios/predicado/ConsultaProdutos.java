import java.util.*;
import java.util.function.Predicate;

public class ConsultaProdutos {


    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> t) {
        List<Produto> produtoList = new ArrayList<>();



        for (Produto produto : produtos) {
            if (t.test(produto) == true) {
                produtoList.add(produto);

            }

        }
        return produtoList;
    }
}
