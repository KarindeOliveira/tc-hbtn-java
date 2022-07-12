import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){

        return pedido.getProdutos().stream().filter(list -> list.getCategoria() == CategoriaProduto.LIVRO).collect(Collectors.toList());


    }

    public static Produto obterProdutoMaiorPreco (List<Produto> produtos){

        return produtos.stream().sorted(comparing(Produto::getPreco).reversed()).limit(1).collect(Collectors.toList()).get(0);

    }



}
