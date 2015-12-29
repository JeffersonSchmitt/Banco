package banco;

public class Adm extends Cliente {

    private String nCadastro;

    public void Cadastro(String cadastro) {
        this.nCadastro = cadastro;
    }
    
    public String getNCadastro(){
        return this.nCadastro;
    }
}
