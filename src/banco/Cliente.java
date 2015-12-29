package banco;

public class Cliente extends Conta implements IVerificacao {

    private int id;
    private String nome;
    private String dataAniversario;
    private String cpf;
    private String telefone;

    public Cliente(int id, string nome, string dataAniversario, string cpf)
    {
        this.iD = id;
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.cpf = cpf;
    }
    
    public setTelefone(string telefone){
        //fazer validações
        
        this.Telefone = telefone;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDataAniversario(){
        return this.dataAniversario;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String getTelefone(){
        return this.telefone;
    }

    public Boolean verifica() {
        if (this.ID != ID) {
            return false;
        } else {
            return true;
        }
    }

}
