/** Aluno: Vanessa Albino da Silveira Trab GA Lab 1 Turma:61 2018/2 */
 
import java.util.GregorianCalendar;

public class Data{ 
    private int dia;
    private int mes;
    private int ano;
    // constroi o objeto Data com os valores recebidos via par�metros
    public Data(int d, int m, int a){
        ano= a;
        mes = m;
        dia = d;
    }
    
    // constroi o objeto Data com a data atual
    public Data(){
        GregorianCalendar c = new GregorianCalendar();
        dia = c.get(GregorianCalendar.DAY_OF_MONTH);
        mes = c.get(GregorianCalendar.MONTH)+1;
        ano = c.get(GregorianCalendar.YEAR);
    }

    public int getAno() { return ano; }
    public int getMes() { return mes; }
    public int getDia() { return dia; }

    public String dataPadrao(){
        return dia + "/" + mes + "/" + ano;  
    }
    public int dataInvertida(){ 
        return ano * 10000 + mes * 100 + dia; 
    }
 
}