package banco;

import java.util.Scanner;

public abstract class Conta {

    int IDconta;
    protected double saldo;
    int ClienteID;
    Scanner Leitura = new Scanner(System.in);

    public void Saca(double valor) {
        System.out.println("Valor para o saque?");
        Leitura.nextDouble();
        if (saldo < 0) {
            System.out.println("conta negativa não podera efetuar saques");
            this.saldo = 0;
        } else {
            valor -= this.saldo;
        }
    }
}
