package Unidade04;

import java.util.Scanner;

public class Uni4Exe14 {

    public Uni4Exe14() {

        Scanner in = new Scanner(System.in);

        int dia = in.nextInt();
        int mes = in.nextInt();
        int ano = in.nextInt();

        if (mes == 2 && ano / 4 == 0 && dia < 30) {
            System.out.println("Valida");
        }
        if (mes == 2 && ano / 4 != 0 && dia < 29) {
            System.out.println("Valida");
        }
        if (mes >= 1 && mes <= 12 && dia < 32) {
            System.out.println("Valida");
        } else {
            System.out.println("Nao valida");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe14();
    }
}
