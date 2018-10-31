public class GeraExibeSequenciaInteiros{
    private int limiteUm;
    private int limiteDois;
    
    public GeraExibeSequenciaInteiros(int limiteUm, int limiteDois){
        if(limiteUm < limiteDois){
            this.limiteUm = limiteUm;
            this.limiteDois = limiteDois;
        } else {
            this.limiteUm = limiteDois;
            this.limiteDois = limiteUm;
        }
    }
    
    public void geraExibeInt(){
        for(int numeroGerado = this.limiteUm; numeroGerado <= this.limiteDois; numeroGerado++){
            System.out.println(numeroGerado);
        }
    }
    
    public void geraExibePares(){
        for(int numeroGerado = this.limiteUm; numeroGerado <= this.limiteDois; numeroGerado++){
            if((numeroGerado % 2) == 0){
                System.out.println(numeroGerado);
            }
        }
    }
}