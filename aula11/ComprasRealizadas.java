public class ComprasRealizadas{
    private double valorTotal;
    private int qtdCompras;
    private double valorMaiorCompra;
    
    public ComprasRealizadas(){
        this.valorTotal = 0;
        this.qtdCompras = 0;
        this.valorMaiorCompra = 0;
    }
    
    public void fazMaisUmaCompra(double valorCompra){
        final int VALOR = 5;
        if(valorCompra >= VALOR){
            qtdCompras +=1;
            valorTotal += valorCompra;
            
            if(valorCompra > this.valorMaiorCompra){
                this.valorMaiorCompra = valorCompra;
            }
        }
    }
    
    public double valorMedioComprado(){
        return valorTotal/qtdCompras;
    }
    
    public double getMaior(){
        return this.valorMaiorCompra;
    }
}