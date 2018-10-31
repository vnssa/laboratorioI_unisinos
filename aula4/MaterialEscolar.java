public class MaterialEscolar{
    private int codigo;
    private String nome;
    private double preco;
    private int qtEstoque;
    
    //Construtor:
    public MaterialEscolar(int c, String n, double p, int q){
        codigo = c;
        nome = n;
        preco = p;
        qtEstoque = q;
    }
    
    //Método para editar o nome:
    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    //Método para mudar preço:
    public void setPreco(double novoPreco){
        preco = novoPreco;
    }
    
    //Método para acessar os atributos:
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getEstoque(){
        return qtEstoque;
    }
    
    //Método para adicionar quantidades ao estoque:
    public void compraMaterial(int qtCompra){
        qtEstoque += qtCompra;
    }
    
    //Método para venda de materiais:
    public void vendeMaterial(int qtVenda){
        qtEstoque -= qtVenda;
    }
    
}