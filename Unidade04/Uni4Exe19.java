package Unidade04;

import java.util.Scanner;

public class Uni4Exe19 {

    public Uni4Exe19() {

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Y = in.nextInt();

        if (X == 0 && Y == 0) {
            System.out.println("ORIGEM");
        } if ( X > 0 && Y > 0) {
            System.out.println("PRIMEIRO");
        } if ( X > 0 && Y < 0 ) {
            System.out.println("SEGUNDO");
        } if ( X < 0 && Y > 0) {
            System.out.println("TERCEIRO");
        } if ( X < 0 && Y < 0) {
            System.out.println("QUARTO");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe19();
    }
}
