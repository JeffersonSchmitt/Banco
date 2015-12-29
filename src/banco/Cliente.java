
package banco;


public class Cliente extends Conta implements IVerificacao{
     int ID;
    String Nome;
    int Anodenascimento;
    String CPF;
    String Telefone;
   
    public Boolean verifica() {
        if(this.ID !=ID){
            return false;
        }else{
            return true;
        }    
    }
    
 

    
}
