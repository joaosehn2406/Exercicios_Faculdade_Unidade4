package Unidade04;

import java.util.Scanner;

public class Uni4Exe20 {

    public Uni4Exe20() {

        Scanner in = new Scanner(System.in);

        float nota1 = in.nextFloat();
        float nota2 = in.nextFloat();
        float nota3 = in.nextFloat();
        float media = (nota1 + nota2 * 2 + nota3 * 5) / 7;

        if (media >= 9) {
            System.out.println("A");
        } if (media >= 7.5 && media < 9) {
            System.out.println("B");
        } if (media >= 6 && media < 7.5) {
            System.out.println("C");
        } if ( media >= 4 && media < 6) {
            System.out.println("D");
        } if ( media < 4) {
            System.out.println("E");
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe20();
    }
}
