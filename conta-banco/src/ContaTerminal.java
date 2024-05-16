
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Informe o número da conta: ");
      int numeroConta = sc.nextInt();
      
      System.out.println("Informe a agência bancária:");
      String agencia = sc.next();
      
      sc.nextLine();
      System.out.println("Informe o nome do proprietário da conta:");
      String nomeCliente = sc.nextLine();

      System.out.println("Informe o saldo presente nesta conta: ");
      Double saldo = sc.nextDouble();

    System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    
    
    sc.close();
    }
    
}
