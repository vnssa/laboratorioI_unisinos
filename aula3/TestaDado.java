public class TestaDado {
    // método principal
    public static void main (String[] args) {
        //declaração de variáveis
        int resultado;
        Dado d;
        //instanciação de objeto
        d = new Dado(6);
        //chamada de método
        resultado = d.jogaDado();
        //exibição na tela
        System.out.println("O dado foi jogado e deu: " + resultado);
    }//fim do método main
} //fim da classe de teste