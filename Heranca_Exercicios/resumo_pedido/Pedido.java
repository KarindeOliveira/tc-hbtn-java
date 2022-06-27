
public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;



    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens) {
            total = total + (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }
        return (total - total * this.percentualDesconto/100);
    }

    public void apresentarResumoPedido(){
        double total = 0; double totalProduto = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
           String corteTipo = String.valueOf(item.getProduto().getClass().getName());
            String tipo = corteTipo.substring(9);
            
        System.out.printf("Tipo: "+ tipo +" Titulo: "+item.getProduto().getTitulo()+
                " Preco: %.2f Quant: %d Total: %.2f\n", item.getProduto().obterPrecoLiquido(),item.getQuantidade(),item.getQuantidade()*item.getProduto().obterPrecoLiquido());

            total = total + (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
            totalProduto = totalProduto + item.getProduto().obterPrecoLiquido()*item.getQuantidade();
        }

        double totalPedido = totalProduto - totalProduto * this.percentualDesconto/100;
        System.out.println("--------------");
        System.out.printf("DESCONTO: %.2f\n", percentualDesconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProduto);
        System.out.println("--------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalPedido);
        System.out.println("--------------");
    }



    public double getPercentualDesconto() {
        return percentualDesconto;
    }


    public ItemPedido[] getItens() {
        return itens;
    }

}
