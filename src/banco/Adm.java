package banco;

public class Adm extends Cliente {

    private String nCadastro;

    public Adm(int id, String nome, String dataAniversario, String cpf) {
        super(id, nome, dataAniversario, cpf);
    }

    public void Cadastro(String cadastro) {
        this.nCadastro = cadastro;
    }
    
    public String getNCadastro(){
        return this.nCadastro;
    }
}
