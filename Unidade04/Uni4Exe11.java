package Unidade04;

import java.util.Scanner;

public class Uni4Exe11 {

    public Uni4Exe11() {

        Scanner in = new Scanner(System.in);

        int idade1 = in.nextInt();
        int idade2 = in.nextInt();
        int idade3 = in.nextInt();

        if(idade1 == idade2 && idade2 == idade3 ) {
            System.out.println("TRIGEMIOS");
        } if ( idade1 == idade2 && idade2 != idade3) {
            System.out.println("GEMIOS");
        } else {
            System.out.println("APENAS IRMAOS");
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe11();
    }
}
