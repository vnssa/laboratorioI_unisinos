/** Aluno: Vanessa Albino da Silveira Trab GA Lab 1 Turma:61 2018/2 */
public class TestaSiteDeVendas{
    
    public static void main(String[] args){
        Teclado t = new Teclado();
        
        //Instancia dois produtos com dados adequados
        Produto p1, p2;
        p1 = new Produto("8", "Caneta", 5.5, 40);
        p2 = new Produto("95", "Caderno", 20.5, 20);
        
        //instancia tres vendedores com dados adequados
        Vendedor v1, v2, v3;
        v1 = new Vendedor("Ademilton", 21, 9, 2015);
        v2 = new Vendedor("Sandra", 12, 7, 2017);
        v3 = new Vendedor("Alex", 11, 10, 2018);
        
        //instancia o site de vendas com os vendedores e produtos
        //instanciados
        SiteDeVendas oSite;
        oSite = new SiteDeVendas(v1, v2, v3, p1, p2);
        
        //Abastece o estoque do produto 1, lendo a quant do teclado
        p1.abastece(t.leInt("Digite a quantidade de abastecimento P1: "));
        
        //Abastece o estoque do produto 2, lendo a quant do teclado
        p2.abastece(t.leInt("Digite a quantidade de abastecimento P2: "));
        
        //Exibe o código, a descrição e o preço dos dois produtos
        System.out.println("Código P1: " + p1.getCodigo() +
                            "\nDescrição P1: " + p1.getDescricao() +
                            "\nPreço P1: " + p1.getPreco() +
                            "\nCódigo P2: " + p2.getCodigo() +
                            "\nDescrição P2: " + p2.getDescricao() +
                            "\nPreço P2: " + p2.getPreco());
        
        System.out.println("\f Colocando o site em operação para teste");

        int n = t.leInt("Quantos pedidos? ");
        for (int i=1; i<=n;i++){
            int quantas1,quantas2;
                Pedido pedido=null;
                if( Character.toUpperCase(t.leChar ("Quer comprar os dois produtos? "))=='S'){
                    quantas1 = t.leInt("Quantas unidades do produto 1? ");
                    quantas2 = t.leInt("Quantas unidades do produto 2? ");
                    pedido = oSite.recebeSolicitacao(1,quantas1,2,quantas2);
                } else
                  if( Character.toUpperCase(t.leChar ("Quer comprar somente o produto 1? "))=='S'){
                      quantas1 = t.leInt("Quantas unidades do produto 1? ");
                      pedido = oSite.recebeSolicitacao(1,quantas1);
                } else
                  if( Character.toUpperCase(t.leChar ("Quer comprar somente o produto 2? "))=='S'){
                      quantas2 = t.leInt("Quantas unidades do produto 2? ");
                      pedido = oSite.recebeSolicitacao(2,quantas2);
                }
            if (oSite.atendePedido(pedido)){
                System.out.println("Pedido atendido com sucesso");
                pedido.exibe(i);
            } else
                System.out.println("Não foi possível atender o pedido "+i);
            System.out.print("Fim do pedido "+i); t.leString(" tecle Enter para nova tela");
        } //fim for
        System.out.println("\f-----------------------------------------------");
        
        // Faz promoção do produto 2, dando desconto de 10%
        p2.fazPromocao(0.1);
        
        // Exibe o código, a descrição, a quantidade em estoque e o preço dos dois produtos
        System.out.println("Código P1: " + p1.getCodigo() +
                            "\nDescrição P1: " + p1.getDescricao() +
                            "\nPreço P1: " + p1.getPreco() +
                            "\nCódigo P2: " + p2.getCodigo() +
                            "\nDescrição P2: " + p2.getDescricao() +
                            "\nPreço P2: " + p2.getPreco());
        //Exibe os vendedores
        v1.exibeDados();
        v2.exibeDados();
        v3.exibeDados();
        // Exibe o nome do vendedor com o maior valor vendido
        if(v1.getTotal() > v2.getTotal() && v1.getTotal() > v3.getTotal()){
            System.out.println("O(a) vendedor(a) com maior valor vendido foi: " + v1.getNome());
        } else if(v2.getTotal() > v1.getTotal() && v2.getTotal() > v3.getTotal()){
            System.out.println("O(a) vendedor(a) com maior valor vendido foi: " + v2.getNome());
        } else if(v3.getTotal() > v1.getTotal() && v3.getTotal() > v2.getTotal()){
            System.out.println("O(a) vendedor(a) com maior valor vendido foi: " + v3.getNome());
        }
    }//fim do método main
 }//fim da classe de teste
