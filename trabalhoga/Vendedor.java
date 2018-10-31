/** Aluno: Vanessa Albino da Silveira Trab GA Lab 1 Turma:61 2018/2 */
public class Vendedor{
    private String nomeVendedor;
    private Data dataAdmissao;
    private double totalVendido;
    private double comissaoVenda;
    
    public Vendedor(String nome, Data data){
        this.nomeVendedor = nome;
        this.dataAdmissao = data;
        this.totalVendido = 0;
        this.comissaoVenda = 0;
    }
    
    public Vendedor(String nome, int dia, int mes, int ano){
        this.nomeVendedor = nome;
        this.dataAdmissao = new Data(dia, mes, ano);
        this.totalVendido = 0;
        this.comissaoVenda = 0;
    }
    
    //métodos chamado sempre que o vendedor realizar uma venda
    private void calculaComissao(){
        if(dataAdmissao.getAno() < 2018){
            this.comissaoVenda = 0.1 * totalVendido;
        } else if(dataAdmissao.getAno() == 2018){
            this.comissaoVenda = 0.05 * totalVendido;
        }
    }
    
    public void realizaVenda(Pedido pedido){
        this.totalVendido += pedido.calculaValorDoPedido();
        calculaComissao();
    }
    
    public void exibeDados(){
        System.out.println("Nome do Vendedor: " + this.nomeVendedor);
        System.out.println("Data de Admissão: " + this.dataAdmissao.getDia() + "/" + this.dataAdmissao.getMes() + "/" + this.dataAdmissao.getAno());
        System.out.println("Total Vendido: " + this.totalVendido);
        System.out.println("Comissão das Vendas: " + this.comissaoVenda);
    }
    
    public String getNome(){
        return this.nomeVendedor;
    }
    
    public Data getData(){
        return this.dataAdmissao;
    }

    public double getTotal(){
        return totalVendido;
    }

    public double getComissao(){
        return this.comissaoVenda;
    }
}