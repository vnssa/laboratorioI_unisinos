public class Cofrinho {
    
    private String nome;
    private double qtdCinquentaCentavos = 0;
    private double qtdVinteCincoCentavos = 0;
    private double qtdDezCentavos = 0;
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void depositaUmaMoedaDezCentavos(){
        qtdDezCentavos += 1; 
    }
    
    public void depositaUmaMoedaVinteCincoCentavos(){
        qtdVinteCincoCentavos += 1;
    }
    
    public void depositaUmaMoedaCinquentaCentavos(){
        qtdCinquentaCentavos += 1;
    }
    
    public double calculaTotal(){
        return ((qtdDezCentavos * 0.1) + (qtdVinteCincoCentavos * 0.25) + (qtdCinquentaCentavos * 0.5));
    }
}