package curso.udemy;

import Entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Entre com o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Entre com o nome do cliente: ");
        sc.nextLine();
        String cliente = sc.nextLine();

        System.out.print("Deseja depositar um valor inicial (y/n)? ");
        char response = sc.next().charAt(0);
        if(response =='y'){
            System.out.print("Digite o valor inicial do depósito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, cliente, depositoInicial);
        }
        else{
            conta = new Conta(numeroConta, cliente);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Digite o valor do depósito: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();


    }
}
