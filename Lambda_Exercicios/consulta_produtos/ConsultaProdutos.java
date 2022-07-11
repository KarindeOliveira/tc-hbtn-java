import java.util.*;

public class ConsultaProdutos {


    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro filtro) {
        List<Produto> produtoList = new ArrayList<>();


        for (Produto produto : produtos) {
            if (filtro.testar(produto) == true) {
                produtoList.add(produto);

            }

        }
        return produtoList;
    }
}
