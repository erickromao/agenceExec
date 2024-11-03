
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = scan.next();

        System.out.println("Type your agency: ");
        String agency = scan.next();

        System.out.println("Type your number account: ");
        String numberAccount = scan.next();

        System.out.println("Type your bank balance: ");
        double bankBalance = scan.nextDouble();


        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é, " + agency
                + " conta " + numberAccount + " e seu saldo " + bankBalance + " já está disponível para saque.");


    }
}
//"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
