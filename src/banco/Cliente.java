package banco;

public class Cliente extends Conta implements IVerificacao {

    private int id;
    private String nome;
    private String dataAniversario;
    private String cpf;
    private String telefone;

    public Cliente(int id, String nome, String dataAniversario, String cpf) {
        this.id = id;
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.cpf = cpf;
    }

    public void Telefone(String telefone) {
        //fazer validações

        this.telefone = telefone;
    }
    
    public Double verSaldo() {
        return this.saldo;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataAniversario() {
        return this.dataAniversario;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public Boolean verifica() {
        if (this.id != id) {
            return false;
        } else {
            return true;
        }
    }

}
