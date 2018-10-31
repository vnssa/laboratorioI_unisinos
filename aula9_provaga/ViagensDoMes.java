/**Aluno: Vanessa Silveira Turma: 71 Prova GA Lab I*/
public class ViagensDoMes{
    private Veiculo v1;
    private Veiculo v2;
    private double totalArrec;
    private int mesViagem;
    
    public ViagensDoMes(Veiculo v1, Veiculo v2, int mesViagem){
        this.v1 = v1;
        this.v2 = v2;
        this.mesViagem = mesViagem;
        this.totalArrec = 0;
    }
    
    private int alocaVeiculo(){
        if(v1.getEmViagem() == false){
            v1.setEmViagem(true);
            return 1;
        } else if(v2.getEmViagem() == false){
            v2.setEmViagem(true);
            return 2;
        } 
        return 0;
    }
    
    public Veiculo fazViagem(double qViagem){
        int a = alocaVeiculo();
        if(a == 1){
            v1.anda(qViagem);
            calculaValorViagem(qViagem);
            return v1;
        } else if(a == 2){
            v2.anda(qViagem);
            calculaValorViagem(qViagem);
            return v2;
        } return null; 
    }
    
    public void liberaVeiculo(Veiculo veiculoFim){
        veiculoFim.setEmViagem(false);
    }
    
    public int oTrimestre(){
        if(this.mesViagem >=1 || this.mesViagem <=3){
            return 1;
        } else if(this.mesViagem >=4 || this.mesViagem <=6){
            return 2;
        } else if(this.mesViagem >=7 || this.mesViagem <=9){
            return 3;
        }  return 4;
    }
    
    private void calculaValorViagem(double quilometragem){
        if(oTrimestre() == 1){
            final double VALOR = 25.0;
            this.totalArrec += quilometragem * VALOR;
        } else if(oTrimestre() == 2 || oTrimestre() == 4){
            final double VALOR = 12.0;
            this.totalArrec += quilometragem * VALOR;
        } else if(oTrimestre() == 3){
            final double VALOR = 20.0;
            this.totalArrec += quilometragem * VALOR;
        }
    }
    
    public boolean atingiuMeta(double meta){
        if(this.totalArrec >= meta){
            return true;
        } return false;
    }
    
    public Veiculo oCampeaoDoMes(){
        if(v1.getQuilometragem() > v2.getQuilometragem()){
            return this.v1;
        } else if(v1.getQuilometragem() == v2.getQuilometragem()){
            return null;
        } return this.v2;
    }
    
    public Veiculo getV1(){
        return this.v1;
    }
    
    public Veiculo getV2(){
        return this.v2;
    }
    
    public double getTotal(){
        return this.totalArrec;
    }
    
    public int getMes(){
        return this.mesViagem;
    }
}