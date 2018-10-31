/** Aluno: Vanessa Albino da Silveira Trab GA Lab 1 Turma:61 2018/2 */
public class Pedido{
    private ItemDoPedido umItem;
    private ItemDoPedido outroItem;
    
    public Pedido(Produto p1, Produto p2, int qtdItemUm, int qtdItemDois){
        this.umItem = new ItemDoPedido(p1, qtdItemUm);
        this.outroItem = new ItemDoPedido(p2, qtdItemDois);
    }
    
    public Pedido(Produto p1, int qtd){
        this.umItem = new ItemDoPedido(p1, qtd);
        this.outroItem = null;
    }
    
    public double calculaValorDoPedido(){
        double valorTotalPedido = umItem.totalItem() + outroItem.totalItem();
        return valorTotalPedido;
    }
    
    public void exibe(int numPedido){
        System.out.println("Número do pedido: " + numPedido);
        umItem.exibe();
        outroItem.exibe();
        System.out.println(calculaValorDoPedido());
    }
    
    public boolean atende(){
        if(umItem.baixaItemDoEstoque(umItem.getQtdPedida()) || outroItem.baixaItemDoEstoque(outroItem.getQtdPedida())){
            return true;
        } else { return false; }
    }
    
    public ItemDoPedido getUmItem(){
        return this.umItem;
    }
    
    public ItemDoPedido getOutroItem(){
        return this.outroItem;
    }
}