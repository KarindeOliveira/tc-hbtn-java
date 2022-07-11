import java.util.function.Predicate;


@FunctionalInterface
public interface CriterioFiltro<T> {

    public boolean testar(Produto produto);


}
