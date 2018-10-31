/** Aluno: Vanessa Albino da Silveira Trab GA Lab 1 Turma:61 2018/2 */
public class ItemDoPedido{
    private Produto produto;
    private int qtdPedida;
    
    public ItemDoPedido(Produto produto, int qtdPedida){
        this.produto = produto;
        this.qtdPedida = qtdPedida;
    }
    
    public double totalItem(){
        double total = produto.getPreco() * qtdPedida;
        return total;
    }
    
    public void exibe(){
        System.out.println("Código: " + produto.getCodigo() + 
                           "\nDescrição: " + produto.getDescricao() +
                           "\nQuantidade Pedida: " + this.qtdPedida +
                           "\nPreço da Unidade: " + produto.getPreco() +
                           "\nValor total do pedido: " + totalItem() + 
                           "\n--------------------------------------");
    }
    
    public boolean baixaItemDoEstoque(int qtdPedida){
        if(qtdPedida < produto.getEstoque()){
            produto.baixaDoEstoque(this.qtdPedida);
            return true;
        } 
        return false;
    }
    
    public Produto getProduto(){
        return this.produto;
    }
    
    public int getQtdPedida(){
        return this.qtdPedida;
    }
}