public class TesteMaterialEscolar{
    
    public static void main(String[] args){
        
        //i)
        MaterialEscolar m1 = new MaterialEscolar(23, "caneta", 7.5, 20);
        
        //ii)
        MaterialEscolar m2 = new MaterialEscolar(67, "lápis", 2.5, 50);
        
        System.out.println("iii)");
        System.out.println("Código: " +m1.getCodigo() + "\nNome: " +m1.getNome() + "\nPreço: " +m1.getPreco() + "\nQuantidade no Estoque: " +m1.getEstoque());
        
        System.out.println("iv)");
        m1.vendeMaterial(3);
        System.out.println("Nova quantidade em estoque: " +m1.getEstoque());
        
        System.out.println("v)");
        m2.setPreco(2.7);
        System.out.println("Novo preço do lápis: " +m2.getPreco());
        
        System.out.println("vi)");
        m1.compraMaterial(10);
        System.out.println("Nova quantidade em estoque: " +m1.getEstoque());
        
        System.out.println("vii)");
        System.out.println("Código: " +m1.getCodigo() + "\nNome: " +m1.getNome() + "\nPreço: " +m1.getPreco() + "\nQuantidade no Estoque: " +m1.getEstoque());
        System.out.println("Código: " +m2.getCodigo() + "\nNome: " +m2.getNome() + "\nPreço: " +m2.getPreco() + "\nQuantidade no Estoque: " +m2.getEstoque());
    }
}
