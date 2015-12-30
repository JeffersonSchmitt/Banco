package banco;

public class ContaC extends Conta {

    public ContaC(int idConta, int clienteId, double saldo) {
        this.idConta = idConta;
        this.clienteId = clienteId;
        this.saldo = saldo;
    }

   /* @Override
    public void saca(double valor) {
        if (valor > 1000) {
            System.out.println("Valor acima do limite");
        } else {
            valor -= this.saldo;

        }
    }*/
}
