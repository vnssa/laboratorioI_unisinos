public class PraticandoComandoIf {
    /** (a) método que recebe via parâmetros 2 números inteiros e
    retorna “Maior: <valor-do-maior>” ou “São iguais” se forem
    iguais.*/
    public String retornaMaior(int primeiroNumero, int segundoNumero){
        int maiorNumero = 0;
        String s;
        if(primeiroNumero != segundoNumero){
            if(primeiroNumero > segundoNumero){
                maiorNumero = primeiroNumero;
            } else {maiorNumero = segundoNumero;}
            s = "Maior número: " + maiorNumero;
        } else {s = "São iguais!";}
        return s;
    }
    
    /**(b) método que sorteia um número inteiro randômico tiradodo 
    intervalo [1,10] e imprime-o. A seguir, retorna uma mensagem 
    dizendo se ele é par ou ímpar.*/
    
    public String verificaParImpar(){
        String s;
        int numeroAleatorio = 1 + (int) (Math.random() * 10);
        if(numeroAleatorio%2 == 0){
            s = "O número " + numeroAleatorio + " é par!";
        } else {s = "O número " + numeroAleatorio + " é ímpar!";}
        return s;
    }
    
    /**(c) método que recebe via parâmetros 2 números inteiros que
    indicam o inicio e o fim do intervalo[inicio, fim). O menor
    é o inicio e o maior é o fim. Sorteia um número inteiro
    randômico tirado deste intervalo e imprime-o. A seguir,
    retorna uma mensagem dizendo se ele é par ou ímpar.*/
    
    public void sorteiaIntervalo(int primeiro, int ultimo){
        String s;
        int numeroSorteado = primeiro + (int) (Math.random() * ultimo);
        System.out.println(numeroSorteado);
        if(numeroSorteado%2 == 0){
            s = "O número " + numeroSorteado + " é par!";
        } else {s = "O número " + numeroSorteado + " é ímpar!";}
    }
    
    /**(d) método que lê recebe, via parâmetro, um nome de pessoa
    e retorna a quantidade de caracteres que o nome possui.*/
    
    public String numeroCaracteres(String nome){
        String s;
        int t = nome.length();
        return s = "Este nome possui " + t + " caracteres.";
    }
    
    /**(e) método que recebe via parâmetros dois objetos Cofrinho
    e retorna o nome do dono do cofrinho com o maior valor
    depositado ou a mensagem “Valores iguais”*/
    
    public String maiorDeposito(Cofrinho cof1, Cofrinho cof2){
        double valor1 = cof1.calculaTotal();
        double valor2 = cof2.calculaTotal();
        String s;
        if(valor1 != valor2){
            if(valor1 > valor2){
                s = cof1.getNome();
            } else {s = cof2.getNome();}
            s = "Dono do cofrinho com maior valor depositado: " + s;
        } else {s = "São iguais!";}
        return s;
    }
    
    /**(f) método que recebe via parâmetros dois objetos Cofrinho
    e retorna o cofrinho com o maior valor depositado ou null
    se os dois cofrinhos têm o mesmo valor.*/
    
    public String maiorDepositoNull(Cofrinho cof1, Cofrinho cof2){
        double valor1 = cof1.calculaTotal();
        double valor2 = cof2.calculaTotal();
        String s;
        if(valor1 != valor2){
            if(valor1 > valor2){
                s = cof1.getNome();
            } else {s = cof2.getNome();}
            s = "Dono do cofrinho com maior valor depositado: " + s;
        } else {s = "";}
        return s;
    }
    
    /**(g) método recebe duas notas de um estudante e calcula a
    sua média. Se for 6 ou mais, retorna a mensagem “Aprovado”.
    Se não aprovou, a nota de uma prova de recuperação deve
    substituir a menor das duas notas iniciais e a média deve
    ser recalculada. Se der 6 ou mais, retornar a mensagem
    “Aprovado com recuperação”, caso contrário, “Reprovado”. A
    nota da recuperação deve ser lida de teclado.*/ 
    
    
}