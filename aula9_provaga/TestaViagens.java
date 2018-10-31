/**Aluno: Vanessa Silveira Turma: 71 Prova GA Lab I*/
public class TestaViagens{
    public static void main(String[] args){
        Teclado t = new Teclado();
        ViagensDoMes viagem;
        
        viagem = new ViagensDoMes((new Veiculo((t.leString("Digite o código do veículo: ")))),
                            (new Veiculo((t.leString("Digite o código do veículo: ")))), 
                            t.leInt("Digite o mês da viagem: "));
                            
        Veiculo v;
        v = viagem.fazViagem((5 + (double) (Math.random() * 500)));
        v = viagem.fazViagem((5 + (double) (Math.random() * 500)));
        viagem.liberaVeiculo(v);
        
        v = viagem.fazViagem((5 + (double) (Math.random() * 500)));
        if(v == null){System.out.println("Não foi possível realizar a terceira viagem!");}
        else{if(viagem.oCampeaoDoMes() == null){
                System.out.println("Empate");
             }
             System.out.println("O código do campeão do mês é: " + viagem.oCampeaoDoMes().getCodigo() +
                                "\nA quilometragem do campeão do mês é: " + viagem.oCampeaoDoMes().getQuilometragem());
        }
        
        boolean metaAtingida = viagem.atingiuMeta(t.leDouble("Digite a meta:"));
        if(metaAtingida){System.out.println("A empresa atingiu a meta!");}
        else{System.out.println("A empresa não atingiu a meta!");}
    }
}
