public class VentiladorAnalogico{

    private int velocidade = 0;
    
    public VentiladorAnalogico(){
    }
    
    public VentiladorAnalogico(int v){
        this.velocidade = v;
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public void aumentaVelocidade(){
        if(this.velocidade == 0){
            this.velocidade = 1;
        } else if(velocidade == 1){
            this.velocidade = 2;
        }
    }
    
    public void diminuiVelocidade(){
        if(this.velocidade == 1){
            this.velocidade = 0;
        } else if(this.velocidade == 2){
            this.velocidade = 1;
        } 
        
    }
}