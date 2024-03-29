package Unidade04;

import java.util.Scanner;

public class Uni4Exe13 {

    public Uni4Exe13() {

        Scanner in = new Scanner(System.in);

        System.out.println("a:");
        int carta1 = in.nextInt();
        System.out.println("a: ");
        int carta2 = in.nextInt();
        System.out.println("a: ");
        int carta3 = in.nextInt();
        int cartasBoas = 0;

        if(carta1 == 1 || carta1 == 2 || carta1 == 3 ) {
            cartasBoas ++;
        } if (carta2 == 1 || carta2 == 2 || carta2 == 3 ) {
            cartasBoas ++;
        } if (carta3 == 1 || carta3 == 2 || carta3 == 3 ) {
            cartasBoas ++;
        } if (cartasBoas == 1) {
            System.out.println("TRUCO");
        } if (cartasBoas ==  2) {
            System.out.println("SEIS");
        } if (cartasBoas == 3) {
            System.out.println("NOVE");
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe13();
    }
}
