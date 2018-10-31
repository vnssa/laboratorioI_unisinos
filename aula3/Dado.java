public class Dado{
    //atributos
    private int lados;
    
    //Construtor de objetos
    public Dado (int nlados){
        lados = nlados;
    }
    //Método que simula o lançamento de um lado
    public int jogaDado(){
        return (int) (Math.random() * lados + 1);
    }
}
