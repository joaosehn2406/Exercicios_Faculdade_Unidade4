package Unidade04;
import java.util.Scanner;

public class Uni4Exe02 {

    public Uni4Exe02() {

        Scanner in = new Scanner(System.in);

        System.out.print("DIgite um número maior que 0: ");
        int valor = in.nextInt();

        if( valor % 2 == 0 ) {
            System.out.printf("O número %d é par", valor);
        } else {
            System.out.printf("O número %d é ímpar", valor);
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe02();
    }
}
