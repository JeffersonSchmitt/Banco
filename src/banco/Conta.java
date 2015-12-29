package banco;

import java.util.Scanner;

public abstract class Conta {

    int idConta;
    int clienteId;
    double saldo;
    Scanner Leitura = new Scanner(System.in);

    public void saca(double valor) {
        if (saldo < 0) {
            System.out.println("conta negativa não podera efetuar saques");
            this.saldo = 0;
        } else {
            valor -= this.saldo;
        }
    }
    
    public Double verSaldo(){
        return this saldo;
    }
}
