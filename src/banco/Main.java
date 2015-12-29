package banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione a opção desejada 1 deposito 2 saque 3 transferencia");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Voce escolheu 1.");
                break;
            case 2:
                System.out.println("Voce escolheu 2.");
                break;
            case 3:
                System.out.println("Voce escolheu 3.");
        }

    }

}
