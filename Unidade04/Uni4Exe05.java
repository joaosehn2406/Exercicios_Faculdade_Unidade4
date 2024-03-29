package Unidade04;
import java.util.Scanner;

public class Uni4Exe05 {

    public Uni4Exe05() {

        Scanner in = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean escolha = in.nextBoolean();

        if(escolha) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe05();
    }
}
