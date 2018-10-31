public class Funcionario{
    
    private String nomeFuncionario;
    private double salario;
    private Departamento depto;
    
    public Funcionario(String nom, double sal, Departamento dep){
        nomeFuncionario = nom;
        salario = sal;
        depto = dep;
    }
    
    public Funcionario(String nom, double sal, int num, String nomDepto){
        nomeFuncionario = nom;
        salario = sal;
        depto = new Departamento(num, nomDepto);
    }
    
    public String getNome(){
        return this.nomeFuncionario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public Departamento getDepto(){
        return this.depto;
    }
    
    public void reajustaSalario(int codReaj){
        if(codReaj == 1){
            this.salario += this.salario*0.2;
        } 
        if(codReaj == 2){
            this.salario += this.salario*0.05;
        }
        if(codReaj == 3){
            this.salario += this.salario*0.13;
        }
    }
    
    public void reajustaSalario(int codReaj, double limSal){
        final double BONUS = 57.00;
        reajustaSalario(codReaj);
        if(depto.getNumero()==25 && this.salario < limSal){
            this.salario += BONUS;
        }
    }
}