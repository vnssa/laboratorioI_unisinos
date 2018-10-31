public class Dinheiro {
	private double dinheiro;

    public Dinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double converteParaDolar(){
        return dinheiro/(3.20);
    }

    public double converteParaEuro(){
        return dinheiro/(4.10);
    }

    public void exibeDados(){
        System.out.println(this.dinheiro);
        System.out.println(converteParaDolar());
        System.out.println(converteParaEuro());
    }
}