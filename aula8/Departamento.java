public class Departamento{

     //------ atributos------
     private int numero;
     private String nomeDepartamento;
    
     //-------- construtor-----------------------------------
     public Departamento( int num, String nom) {
         setNumero(num);
         setNome(nom);
     }// fim do construtor
    
     //--------------métodos----------------------
     public void setNumero(int n ) {
         if (n >0)
         numero= n;
     }//--fim do método setNumero ---------------
    
     public void setNome(String n ) {
         if (n.length() >0)
         nomeDepartamento = n;
     }//---fim do método setNome ------------------
    
     public int getNumero( ) {
         return numero;
     }//---fim do método getNumero -----------------
     public String getNome( ) {
         return nomeDepartamento;
     }//---fim do método getNome -------------------
    
    }//fim da classe