package banco;

public class Adm extends Cliente {

    private String Ncadastro;

    public void Cadastro(String cadastro) {
        this.Ncadastro = cadastro;
    }
    
    public String getNCadastro(){
        return this.Ncadastro;
    }
}
