public class TestaAluno{
    
    public static void main(String args[]){
        
        //2.a)
        Teclado t = new Teclado();
      
        Aluno a1 = new Aluno(t.leString("Digite seu nome: "), 
                             t.leDouble("Insira a nota do Grau A:"), 
                             t.leDouble("Insira a nota do Grau B:"));
        
        //2.b)
        Aluno a2 = new Aluno(t.leString("Digite seu nome: "));
        
        //2.c)
        a2.setAvaliacao(t.leDouble("Insira a nota do Grau A: "),
                        t.leDouble("Insira a nota do Grau B: "));
        
        //2.d)
        Avaliacao av1 = new Avaliacao(t.leDouble("Insira a nota do Grau A:"),
                                        t.leDouble("Insira a nota do Grau B:"));
        Aluno a3 = new Aluno("Vanessa", av1);
        
        //2.e)
        double media1 = a1.getAvaliacao().calculaMedia();
        double media2 = a2.getAvaliacao().calculaMedia();
        double media3 = a3.getAvaliacao().calculaMedia();
        
        //2.f)
        System.out.println("Nome do Aluno: " + a1.getNome() + " \nNota GA: " + a1.getAvaliacao().getNotaGrauA() + " \nNota GB: " + a1.getAvaliacao().getNotaGrauB());
        System.out.println("/nNome do Aluno: " + a2.getNome() + " \nNota GA: " + a2.getAvaliacao().getNotaGrauA() + " \nNota GB: " + a2.getAvaliacao().getNotaGrauB());        
        System.out.println("/nNome do Aluno: " + a3.getNome() + " \nNota GA: " + a3.getAvaliacao().getNotaGrauA() + " \nNota GB: " + a3.getAvaliacao().getNotaGrauB());                                                               
    }
}