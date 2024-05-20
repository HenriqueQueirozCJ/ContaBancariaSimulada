import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        ContaTerminal c1 = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência: ");
        c1.Agencia = sr.next();
        System.out.println("Digite seu numero: ");
        c1.Numero = sr.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                "conta nº %d e seu saldo %.2f já está disponível para saque",c1.Nome_Cliente,c1.Agencia,c1.Numero,c1.Saldo);


    }
}
