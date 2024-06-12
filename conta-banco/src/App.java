import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPor favor, digite o número da Agência !");
        conta.setAgencia(scanner.nextLine());
        System.out.println("Por favor, digite o número da Conta !");
        conta.setNumero(scanner.nextInt());
        System.out.println("Por favor, digite o nome do Cliente !");
        conta.setNomeCliente(scanner.nextLine());
        System.out.println("Por favor, digite o saldo da Conta !");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Olá ," + conta.getNomeCliente()
                + " obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
                + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
    }
}
