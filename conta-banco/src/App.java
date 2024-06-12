import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPor favor, digite o número da Agência !");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente !");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o saldo da Conta !");
        double saldoConta = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nome, saldoConta);

        System.out.println("Olá, " + conta.getNomeCliente()
                + " obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
                + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
    }
}
