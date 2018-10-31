public class TestaFuncionario{
    public static void main(String[] args){
        //i) crie (instancie) um funcionário com dados lidos do teclado;
        Teclado t = new Teclado();
        String n = t.leString("Nome do Funcionário: ");
        double s = t.leDouble("Salário: R$");
        int num = t.leInt("Número do departamento: ");
        String nDep = t.leString("Nome do departamento: ");
        
        Funcionario f1 = new Funcionario(n, s, num, nDep);
        
        //ii) leia, do teclado um código de reajuste. Se código inválido, exiba uma mensagem de erro e encerre o programa
        int cod = t.leInt("Digite um código de reajuste(1, 2 ou 3): ");
        
        //iii) Se código válido, realize o que for necessário para aplicar o reajuste (sem valor limite) e exibir a seguinte tela:
        if(cod == 1 || cod == 2 || cod == 3){
            double salarioAnterior = f1.getSalario();
            f1.reajustaSalario(cod);
            System.out.println("Nome Funcionário: "+ f1.getNome()+ 
                                "\nSalario anterior: R$"+ salarioAnterior+
                                "\nSalario reajustado: R$"+ f1.getSalario()+
                                "\nNome do departamento: "+ f1.getDepto().getNome());
        } 
        
        
        
    }
}
