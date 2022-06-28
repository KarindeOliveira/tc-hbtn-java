import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public Pedido(ArrayList<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

    public static int buscarPosicaoNumero(List<Integer> lista, int num) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).intValue() == num) {
                return i;
            }
        }
        return -1;
    }

    public int obterTotalCaixas() {
        int qntcaixas = 0;
        for (int i = 0; i < cookies.size(); i++) {
            qntcaixas = qntcaixas + cookies.get(i).getQuantidadeCaixas();
        }
        return qntcaixas;
    }


    public void adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
    }


    public int removerSabor(String sabor) {
        int qntremovida = 0;
        for (int i = 0; i < cookies.size(); i++) {
            if (cookies.get(i).getSabor().equals(sabor)) {
                qntremovida = qntremovida + cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
            }

        }
        return qntremovida;
    }
}








