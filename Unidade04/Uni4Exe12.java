package Unidade04;

import java.util.Scanner;

public class Uni4Exe12 {

    public Uni4Exe12() {

        Scanner in = new Scanner(System.in);

        int lado1 = in.nextInt();
        int lado2 = in.nextInt();
        int lado3 = in.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado3 != lado1) {
            System.out.println("TRIANGULO ISOSCELES");
        } else {
            System.out.println("TRIANGULO ESCALENO");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe12();
    }
}
