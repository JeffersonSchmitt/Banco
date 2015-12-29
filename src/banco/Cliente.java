package banco;

public class Cliente extends Conta implements IVerificacao {

    int ID { get; private set }
    String Nome { get; private set }
    string dataAniversario { get; private set }
    String CPF { get; private set }
    String Telefone { get; private set }

    public Cliente(int id, string nome, string dataAniversario, string cpf)
    {
        this.ID = id;
        this.Nome = nome;
        this.dataAniversario = dataAniversario;
        this.CPF = cpf;
    }
    
    public SetTelefone(string telefone){
        //fazer validações
        
        this.Telefone = telefone;
    }

    public Boolean verifica() {
        if (this.ID != ID) {
            return false;
        } else {
            return true;
        }
    }

}
