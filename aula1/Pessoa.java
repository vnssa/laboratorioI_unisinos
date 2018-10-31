//Laboratório I - 11 de agosto de 2018
public class Pessoa {
    //Declaração de atributos
    private String nome;
    private int idade;
    
    //Construtor
    public Pessoa (String n, int i){
        nome = n;
        idade = i;
    }
    
    // Método que altera a idade
    public void fazAniversario(){
        idade = idade + 1;
    }
    
    //Método que exibe os dados na tela
    public void exibeDados(){
        System.out.println ("Nome: " +nome);
        System.out.println ("Idade: " +idade);
    }
}//fim da classe
    