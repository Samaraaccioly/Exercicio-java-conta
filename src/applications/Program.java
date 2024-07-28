package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o número da conta: ");
        String numero = sc.nextLine();
        System.out.println("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();
        System.out.println("Existe um depósito inicial? (s/n");
        Character opcao = sc.next().charAt(0);
        sc.nextLine();

        if (opcao == 's') {
            System.out.println("Digite o valor do depósito inicial");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Conta: " );
        System.out.println(conta);

        System.out.println();
        System.out.println("Digite um valor a ser depositado: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println("Conta atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Digite um valor do saque desejado " );
        double saque = sc.nextDouble();
        conta.sacar(saque);
        System.out.println("Conta atualizada: ");
        System.out.println(conta);

        sc.close();

    }
}
