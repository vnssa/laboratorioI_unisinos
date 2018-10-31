public class Cubo{
    
    //Atributos do Cubo:
    private int lado;
    
    //Método para definir o lado:
    public void setLado(int novoLado){
        lado = novoLado;
    }
    
    //Método para calcular a área do cubo:
    public double calculaArea(){
        double areaLateral;
        areaLateral = Math.pow(lado, 2);
        double areaTotal;
        areaTotal = areaLateral * 6;
        return areaTotal;
    }
    
    //Método para calcular volume:
    public double calculaVolume(){
        double volume;
        volume = Math.pow(lado, 3);
        return volume;
    }
    
    //Método para exibir dados:
    public void exibeDados(){
        System.out.println("Lados possuem " + lado + " cm.");
        System.out.println("A área total do cubo é " + calculaArea() + " cm².");
        System.out.println("O volume do cubo é de " + calculaVolume() + " cm³.");
    }
}