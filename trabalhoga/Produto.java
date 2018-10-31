
/** Aluno: Vanessa Albino da Silveira Trab GA Lab 1 Turma:61 2018/2 */
public class Produto{
    private String codigoProduto;
    private String descricaoProduto;
    private double precoUnidade;
    private int qtdEstoque;
    private boolean emFalta;
    
    public Produto(String c, String d, double p, int q){
        setCodigo(c);
        descricaoProduto = d;
        precoUnidade = p;
        qtdEstoque = q;
        if(qtdEstoque == 0){
            emFalta = true;
        } else { 
            emFalta = false; }
    }

    private void setCodigo(String codigoProduto){
        int qtCaracteres = codigoProduto.length();
        if(qtCaracteres == 0){
            this.codigoProduto = "XYZ";
        } else if(qtCaracteres == 1){
            this.codigoProduto = codigoProduto + "XX";
        } else if(qtCaracteres == 2){
            this.codigoProduto = codigoProduto + "Y";
        }
    }
    
    public void abastece(int quantidadeAbastecimento){
        this.qtdEstoque += quantidadeAbastecimento;
        if(this.qtdEstoque > 0){ this.emFalta = false; }
        else{ this.emFalta = true; }
    }
    
    public void baixaDoEstoque(int q){
        this.qtdEstoque = q;
        if(q == 0){
            this.emFalta = true;
        } else {this.emFalta = false;}
    }
    
    public void fazPromocao(double desconto){
        if(emFalta == false){
            this.precoUnidade -= this.precoUnidade * desconto;
        } else {
            this.precoUnidade = this.precoUnidade;
        }
    }
        
    public String getCodigo(){
        return codigoProduto;
    }
    
    public String getDescricao(){
        return descricaoProduto;
    }
    
    public double getPreco(){
        return precoUnidade;
    }

    public int getEstoque(){
        return qtdEstoque;
    }

    public boolean getEmFalta(){
        return emFalta;
    }
}
