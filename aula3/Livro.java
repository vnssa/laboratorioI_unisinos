public class Livro {
    //Atributos:
    private String titulo;
    private boolean emprestado;
    //Construtor:
    public Livro (String t){
        titulo = t;
        emprestado = false;
    }
    //Método para retornar o título quando solicitado:
    public String getTitulo(){
        return titulo;
    }
    //Método para mostrar se o livro foi emprestado ou não:
    public boolean isEmprestado(){
        return emprestado;
    }
    //Método para mudar o valor de emprestado, quando o mesmo acontecer:
    public void empresta(){
        emprestado = true;
    }
    
    public void devolve(){
        emprestado = false;
    }
    public void exibeDados (){
        System.out.println("Título do livro: " +titulo);
        System.out.println("Está emprestado? " +emprestado);
    }
}