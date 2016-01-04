package banco;

import java.util.concurrent.ExecutionException;

public class Cliente extends Conta {

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

    public void SetTelefone(String telefone) throws Exception {
        if(telefone.length() <8) throw new Exception("Telefone não pdoe ser menor que 8 digitos");
        this.telefone = telefone;
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

    public Boolean verifica(int idDigitada) {
        if (this.id != idDigitada) {
            return false;
        } else {
            return true;
        }
    }

}
