public class Retangulo{
    
    //Atributos:
    private int base;
    private int altura;
    
    //Método para alterar base e altura:
    public void setBase(int novaBase){
        base = novaBase;
    }
    public void setAltura(int novaAltura){
        altura = novaAltura;
    }
    
    //Método para calcular área:
    public int calculaArea(){
        int area;
        area = base * altura;
        return area;
    }
    
    //Método para exibir dados na tela:
    public void exibeDados(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calculaArea());
    }
}