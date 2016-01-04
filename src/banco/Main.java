package banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo ao banco do zézinho!");

        Cliente clienteNovo = new Cliente(1, "Lucas", "21/11/1990", "08081608408");
        clienteNovo.setSaldo(1000.0);

        int idDigitada;
            //sistema de login por id
        System.out.println("Entre com a sua ID " + clienteNovo.getNome() + " para continuar");
        idDigitada = input.nextInt();
        while (clienteNovo.verifica(idDigitada) == false) { 
            System.out.println("Digite novamente");
            idDigitada = input.nextInt();
        }
        System.out.println("Login efetuado com sucesso!");
        System.out.println("\n");
        System.out.println("Selecione a opção desejada 1 saque  2 deposito 3 transferencia");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Qual o valor do saque motherfucker?");
                double valorSaque;
                valorSaque = input.nextDouble();
                clienteNovo.saca(valorSaque);
                System.out.println(clienteNovo.getSaldo());
                break;
            case 2:
                //DEPOSITAR
                System.out.println("Qual o valor do deposito motherfucker?");
                double valorDeposito = input.nextDouble();
                clienteNovo.deposita(valorDeposito);
                System.out.println(clienteNovo.getSaldo());
                break;
            case 3:
                //VER SALDO
                System.out.println("Voce escolheu 3.");
                System.out.println(clienteNovo.getSaldo());

        }

    }

}
