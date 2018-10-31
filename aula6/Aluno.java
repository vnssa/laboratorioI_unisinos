public class Aluno{
    private String nomeAluno;
    private Avaliacao avaliacao;
    
    public Aluno(String n1){
        this.nomeAluno = n1;
    }

    public Aluno(String n1, Avaliacao av){
        this.nomeAluno = n1;
        this.avaliacao = av;
    }
    
    public Aluno (String n1, double GA, double GB){
        this.nomeAluno = n1;
        this.avaliacao = new Avaliacao(GA, GB);
    }
    
    public void setNome(String novoNomeAluno){
        this.nomeAluno = novoNomeAluno;
    }
    
    public String getNome(){
        return this.nomeAluno;
    }
    
    public void setAvaliacao(double novaNotaGA, double novaNotaGB){
        this.avaliacao = new Avaliacao(novaNotaGA, novaNotaGB);
    }
    
    public Avaliacao getAvaliacao(){
        return this.avaliacao;
    }
}