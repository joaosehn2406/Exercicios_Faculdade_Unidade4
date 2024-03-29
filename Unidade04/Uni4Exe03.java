package Unidade04;
import java.util.Scanner;

public class Uni4Exe03 {

    public Uni4Exe03() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = in.nextInt();

        System.out.println("Digite outro número");
        int numero2 = in.nextInt();

        int escolha = Math.max(numero1, numero2);
        System.out.printf("O maior número é %d", escolha);

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe03();
    }
}
