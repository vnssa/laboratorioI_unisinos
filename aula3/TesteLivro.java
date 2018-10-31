public class TesteLivro { 
    public static void main (String[] args) { 
        // Declarar duas variáveis objeto, do tipo Livro 
        Livro n1, n2;
        
        //Usando o operador new, criar um livro e atribuir a referência para a 
        // variável adequada 
        n1 = new Livro("Anamelia");
        n2 = new Livro("It");
        
        // Chamar o método para exibir na tela os dados dos dois livros 
        // criados com cabeçalhos “Primeiro Livro” e “Segundo Livro”
        System.out.println("Primeiro Livro:");
        n1.exibeDados();
        System.out.println("Segundo Livro:");
        n2.exibeDados();
        
        // Chamar o método para emprestar o primeiro livro
        n1.empresta();
        
        // Chamar o método para Exibir na tela os dados do primeiro livro
        // com o cabeçalho “Primeiro livro após empréstimo”
        System.out.println("Primeiro Livro após o empréstimo: ");
        n1.exibeDados();
    }
}    
