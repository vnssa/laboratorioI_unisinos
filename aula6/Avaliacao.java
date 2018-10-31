public class Avaliacao{
    
    private double notaGrauA;
    private double notaGrauB;
    
    public Avaliacao(double nA, double nB){
        this.notaGrauA = nA;
        this.notaGrauB = nB;
    }
    
    public void setNotaGrauA(double novaNotaGrauA){
        this.notaGrauA = novaNotaGrauA;
    }
    
    public void setNotaGrauB(double novaNotaGrauB){
        this.notaGrauB = novaNotaGrauB;
    }
    
    public double getNotaGrauA(){
        return this.notaGrauA;
    }
    
    public double getNotaGrauB(){
        return this.notaGrauB;
    }
    
    public double calculaMedia(){
        double media = ((this.notaGrauA) + (2*this.notaGrauB)) / 3;
        return media;
    }
}