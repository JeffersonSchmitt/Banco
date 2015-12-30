package banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo ao banco do zézinho!");
        
        Cliente clienteNovo = new Cliente(1, "Lucas", "21/11/1990", "08081608408");
        Conta contaNova= new ContaC(2,1,1000.0);
        clienteNovo.saldo(1000.0);
        System.out.println("Selecione a opção desejada 1 deposito 2 saque 3 transferencia");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Qual o valor do saque motherfucker?");
                double valorSaque = input.nextDouble();
                clienteNovo.saca(valorSaque);
                break;
            case 2:
                //DEPOSITAR
                System.out.println("Voce escolheu 2.");
                double valorDeposito = input.nextDouble();
                clienteNovo.saca(valorDeposito);
                break;
            case 3:
                //TRANSFERIR
                System.out.println("Voce escolheu 3.");
                 System.out.println(clienteNovo.verSaldo());
        }

    }

}
