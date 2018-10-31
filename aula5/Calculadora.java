public class Calculadora{
    
    public int adicao(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }
    
    public double adicao(double n1, double n2){
        double resultado = n1 + n2;
        return resultado;
    }
    
    public int subtracao(int n1, int n2){
        int resultado = n1 - n2;
        return resultado;
    }
    
    public double subtracao(double n1, double n2){
        double resultado = n1 - n2;
        return resultado;
    }
    
    public int multiplicacao(int n1, int n2){
        int resultado = n1 * n2;
        return resultado;
    }
    
    public double multiplicacao(double n1, double n2){
        double resultado = n1 * n2;
        return resultado;
    }
    
    public double divisaoReal(int n1, int n2){
        double resultado = (double) n1 / n2;
        return resultado;
    }
    
    public double divisaoReal(double n1, double n2){
        double resultado = n1 / n2;
        return resultado;
    }
    
    public int divisaoInteira(int n1, int n2){
        int resultado = n1/n2;
        return resultado;
    } 
    
    public int restoDivisaoInteira(int n1, int n2){
        int resultado = n1 % n2;
        return resultado;
    }
}