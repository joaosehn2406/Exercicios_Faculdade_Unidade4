package Unidade04;


import java.util.Scanner;

public class Uni4Exe08 {

    public Uni4Exe08() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = in.next().toLowerCase();

        switch (letra) {
            case "a":
                System.out.println("Eh vogal");
                break;
            case "b":
                System.out.println("Eh vogal");
                break;
            case "c":
                System.out.println("Eh vogal");
                break;
            case "d":
                System.out.println("Eh vogal");
                break;
            case "e":
                System.out.println("Eh vogal");
                break;
            default:
                System.out.println("Nao eh vogal");
                break;

        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe08();
    }
}
