package banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo ao banco do zézinho!");

        Cliente clienteNovo = new Cliente(1, "Lucas", "21/11/1990", "08081608408");

        Conta contaNova = new ContaC(2, 1, 1000.0);

        clienteNovo.setSaldo(1000.0);

        System.out.println("Selecione a opção desejada 1 saque  2 deposito 3 transferencia");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Qual o valor do saque motherfucker?");
                int valorSaque = input.nextInt();
                clienteNovo.saca(valorSaque);
                System.out.println(clienteNovo.saldo);
                break;
            case 2:
                //DEPOSITAR
                System.out.println("Qual o valor do deposito motherfucker?");
                int valorDeposito = input.nextInt();
                clienteNovo.deposita(valorDeposito);
                System.out.println(clienteNovo.saldo);
                break;
            case 3:
                //TRANSFERIR
                System.out.println("Voce escolheu 3.");
                System.out.println(clienteNovo.getSaldo());

        }

    }

}
