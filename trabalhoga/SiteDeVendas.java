/** Aluno: Vanessa Albino da Silveira Trab GA Lab 1 Turma:61 2018/2 */
public class SiteDeVendas{
    private Vendedor vendedorUm;
    private Vendedor vendedorDois;
    private Vendedor vendedorTres;
    private Produto produtoUm;
    private Produto produtoDois;
    
    public SiteDeVendas(Vendedor v1, Vendedor v2, Vendedor v3, Produto p1, Produto p2){
        this.vendedorUm = v1;
        this.vendedorDois = v2;
        this.vendedorTres = v3;
        this.produtoUm = p1;
        this.produtoDois = p2;
    }
    
    public Pedido recebeSolicitacao(int num,  int qtdP1,int outroNum, int qtdP2){
        Pedido pedido;
        return pedido = new Pedido(produtoUm, produtoDois, qtdP1, qtdP2);
    }
    
    public Pedido recebeSolicitacao(int num, int qtd){
        Pedido pedido;
        Produto p;
        return pedido = new Pedido(produtoUm, qtd);
    }
    
    public boolean atendePedido(Pedido pedido){
        if(pedido.atende()){
            int sorteio = 1 + (int) (Math.random() * 3);
            if(sorteio == 1){ 
                this.vendedorUm.realizaVenda(pedido);
                return true;
            } else if(sorteio == 2){
                this.vendedorDois.realizaVenda(pedido);
                return true;
            } else if(sorteio == 3){
                this.vendedorTres.realizaVenda(pedido);
                return true;
            }
        }
        return false;
    }
}