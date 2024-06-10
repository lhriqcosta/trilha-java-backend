import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ABERTURA DE CONTA");

        System.out.println("Olá! Qual seu nome? ");
        String nome = sc.nextLine();

        System.out.println(nome + ", digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Quanto gostaria de depositar? ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");

        sc.close();

    }
}
