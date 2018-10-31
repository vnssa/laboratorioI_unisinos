public class Circulo{
    
    //Atributos
    private int raio;
    
    //Método para alterar raio:
    public void setRaio (int novoRaio){
        raio = novoRaio;
    }
    
    //Método para calcular área:
    public double calculaArea(){
        double area;
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }
    
    //Método para exibir os dados na tela:
    public void exibeDados(){
        System.out.println ("Raio: " +raio);
        System.out.println ("Área: " +calculaArea());
    }
}