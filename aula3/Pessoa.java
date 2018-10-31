public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    //construtor
    public Pessoa (String n, int i) {
        setNome( n );
        setIdade( i );
    }
    //métodos
    public void setNome(String n ) {
        nome = n;
    }
    public String getNome( ) {
        return nome;
    }
    public void setIdade(int id) {
        idade = id;
    }
    public int getIdade( ) {
        return idade;
    }
    public void fazAniversario( ) {
        idade = idade + 1;
    }
    public void exibeDados( ) {
        System.out.println ("Nome: "+ getNome());
        System.out.println ("Idade: "+ getIdade());
    }
}