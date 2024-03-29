package Unidade04;

import java.util.Scanner;

public class Uni4Exe10 {

    public Uni4Exe10() {

        Scanner in = new Scanner(System.in);

        System.out.println("Idade Marquinhos: ");
        int idadeMarquinhos = in.nextInt();

        System.out.println("Idade Zezinho: ");
        int idadeZezinho= in.nextInt();

        System.out.println("Idade Luluzinha: ");
        int idadeLuluzinha = in.nextInt();

        if(idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha){
            System.out.println("Marquinho eh o mais novo.");
        } if (idadeLuluzinha < idadeZezinho && idadeLuluzinha < idadeMarquinhos) {
            System.out.println("Luluzinha eh a mais nova");
        } else {
            System.out.println("Zezinho eh o mais novo");
        }

        in.close();

    }

    public static void main(String[] args) {
        new Uni4Exe10();
    }
}
