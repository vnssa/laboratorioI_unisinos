public class TesteCompras{
    public static void main(String[] args){

        ComprasRealizadas c1 = new ComprasRealizadas();
        
        Teclado t = new Teclado();
        
        double valorCompra = t.leDouble("Digite o valor da compra: ");
        
        while(valorCompra != 0){ // este 0 é uma Flag - valor ficticio
            c1.fazMaisUmaCompra(valorCompra);
            valorCompra = t.leDouble("Digite o valor da compra: ");
        } 
        
        System.out.println("O valor médio das compras: R$" + c1.valorMedioComprado());
        System.out.println("O valor da maior compra foi: R$" + c1.getMaior());
    }
}