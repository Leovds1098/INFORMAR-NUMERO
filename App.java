import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner utilizado para o usuário usar o teclado para digitar um número
        Scanner sc = new Scanner(System.in);

        // Código para pedir ao usuário para digitar o número direto (informação para o
        // desenvolvedor)
        System.out.println("Digite um número ");

        int numero = sc.nextInt();
        // fechando o Scanner
        sc.close();

        // código que informa o número digitado pelo usuário
        System.out.print("O numero informado foi " + numero);

    }
}