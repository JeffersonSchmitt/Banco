package banco;

import java.util.Scanner;

public abstract class Conta {

    int idConta;
    int clienteId;
    protected double saldo;
    Scanner Leitura = new Scanner(System.in);

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    /*public void saca(double valorSaque) {
        if (saldo < 0) {
            System.out.println("conta negativa não podera efetuar saques");
            this.saldo = 0;
        } else {
            valorSaque -= this.saldo;
        }
    }*/
    public double saca(double valorSaque) {
        valorSaque -= this.saldo;
        return this.saldo;
    }

    public double deposita(double valorDeposito) {
        valorDeposito += this.saldo;
        return this.saldo;
    }
}
