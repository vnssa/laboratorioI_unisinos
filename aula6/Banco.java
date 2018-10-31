public class Banco {
    Dinheiro saldo;
    
    public Banco() {
    }
    
    public Banco(Dinheiro valor) {
        this.saldo = valor;
    }
    
    public void setSaldo(Dinheiro saldo) {
        this.saldo = saldo;
    }
    
    public Dinheiro getSaldo() {
        return saldo;
    }
    
    public void deposita(Dinheiro dinheiro){   
       double ValorTotal = (saldo.getDinheiro() + dinheiro.getDinheiro());
       this.saldo = new Dinheiro(ValorTotal);
    }
    
     // public String toString () {
        // System.out.println("Saldo: R$" + saldo.getDinheiro());
        // System.out.println("Conversão para Euro: £" + saldo.converteParaEuro());
        // System.out.println("Conversão para Dolar: $" + saldo.converteParaDolar());
        
    // }
}