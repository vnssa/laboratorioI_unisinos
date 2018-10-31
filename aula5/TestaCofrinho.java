public class TestaCofrinho{
    public static void main(String [] args){
        
        //a
        Teclado t = new Teclado();
        
        //b
        Cofrinho c1 = new Cofrinho();
        c1.setNome(t.leString("Qual é seu nome? "));
        
        //d
        Cofrinho c2 = new Cofrinho();
        c2.setNome(t.leString("Qual é seu nome? "));
        
        //e
        c1.depositaUmaMoedaDezCentavos();
        c1.depositaUmaMoedaDezCentavos();
        
        //f
        c1.depositaUmaMoedaVinteCincoCentavos();
        c1.depositaUmaMoedaVinteCincoCentavos();
        c1.depositaUmaMoedaVinteCincoCentavos();
        c1.depositaUmaMoedaVinteCincoCentavos();
        
        //g
        c1.depositaUmaMoedaCinquentaCentavos();
        c1.depositaUmaMoedaCinquentaCentavos();
        c1.depositaUmaMoedaCinquentaCentavos();
        
        //h
        c2.depositaUmaMoedaDezCentavos();
        c2.depositaUmaMoedaDezCentavos();
        c2.depositaUmaMoedaDezCentavos();
        c2.depositaUmaMoedaDezCentavos();
        
        //i
        c2.depositaUmaMoedaVinteCincoCentavos();
        c2.depositaUmaMoedaVinteCincoCentavos();
        
        //j
        c2.depositaUmaMoedaCinquentaCentavos();
        c2.depositaUmaMoedaCinquentaCentavos();
        c2.depositaUmaMoedaCinquentaCentavos();
        c2.depositaUmaMoedaCinquentaCentavos();
        
        //k
        c1.setNome(t.leString("Qual é seu nome? "));
        
        //l
        Cofrinho c3 = new Cofrinho();
        c3.setNome(c2.getNome());
        
        //m
        c3.depositaUmaMoedaCinquentaCentavos();
        c3.depositaUmaMoedaCinquentaCentavos();
        
        //n
        double dolar = (t.leDouble("Qual é o valor do dolar? "));
        
        //o
        System.out.println("Olá, " + c1.getNome() + "!");
        System.out.println("Você possui R$" + c1.calculaTotal());
        System.out.println("Se convertermos, você possui $" + c1.calculaTotal() / dolar);
        
        //p
        System.out.println("Olá, " + c2.getNome() + "!");
        System.out.println("Você possui R$" + c2.calculaTotal());
        System.out.println("Se convertermos, você possui $" + c2.calculaTotal() / dolar);
        
        //q
        System.out.println("Olá, " + c3.getNome() + "!");
        System.out.println("Você possui R$" + c3.calculaTotal());
        System.out.println("Se convertermos, você possui $" + c3.calculaTotal() / dolar);
        
        double diferenca = Math.abs(c1.calculaTotal() - c2.calculaTotal());
        System.out.println("A diferença entre os cofrinhos de " + c1.getNome() + " e " + c2.getNome() + " é de " + diferenca + " reais.");
    }
}