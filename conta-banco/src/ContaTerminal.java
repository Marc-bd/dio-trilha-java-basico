import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("Olá, para criar sua conta bancária, vamos precisar de alguns dados.");
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        ", conta " + numero + " e seu saldo " + "R$" + saldo + " já está disponível para saque.");

        scanner.close();

    }
}