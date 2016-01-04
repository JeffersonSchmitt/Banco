package banco;

import java.util.Scanner;

public abstract class Conta {

    int idConta;
    int clienteId;
    protected double saldo;
    Scanner input = new Scanner(System.in);

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void saca(double valorSaque) {
           while (this.saldo-valorSaque< 0) {
            System.out.println("Saldo invalido! Digite o valor de saque novamente");
            valorSaque = input.nextDouble();

        }
            this.saldo-=valorSaque;
          }
    

    public void deposita(double valorDeposito) {
         this.saldo += valorDeposito;
    }
}
