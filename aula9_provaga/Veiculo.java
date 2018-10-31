/**Aluno: Vanessa Silveira Turma: 71 Prova GA Lab I*/
public class Veiculo{
    private String codigoVeiculo;
    private double quilometragemMes;
    private boolean emViagem;
    
    public Veiculo(String codigoVeiculo){
        setCodigo(codigoVeiculo);
        this.quilometragemMes = 0;
        this.emViagem = false;
    }
    
    public void setCodigo(String codigoVeiculo){
        int qtCaracteres = codigoVeiculo.length();
        if(qtCaracteres < 5){
            this.codigoVeiculo = "Indefinido";
        } else {this.codigoVeiculo = codigoVeiculo;}
    }
    
    public void setEmViagem(boolean emViagem){
        this.emViagem = emViagem;
    }
    
    public String traduzSituacaoVeiculo(){
        String s;
        if(this.emViagem){
            s = "Em viagem";
        } else { s = "Disponível"; }
        return s;
    }
    
    public void anda(double qPercorrida){
        this.quilometragemMes += qPercorrida;
    }
    
    public String getCodigo(){
        return this.codigoVeiculo;
    }
    
    public double getQuilometragem(){
        return this.quilometragemMes;
    }
    
    public boolean getEmViagem(){
        return this.emViagem;
    }
}

