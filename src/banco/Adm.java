package banco;

public class Adm extends Cliente {

    private String nCadastro;

    public Adm(int id, String nome, String dataAniversario, String cpf) {
        super(id, nome, dataAniversario, cpf);
    }

    public String setNCadastro(String cadastro) {
        return this.nCadastro;
    }
    public String getNCadastro() {
        return this.nCadastro;
    }
}
