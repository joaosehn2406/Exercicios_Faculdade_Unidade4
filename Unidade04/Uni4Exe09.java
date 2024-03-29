package Unidade04;

import java.util.Scanner;

public class Uni4Exe09 {

    public Uni4Exe09() {


        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 % num2 == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe09();
    }
}
