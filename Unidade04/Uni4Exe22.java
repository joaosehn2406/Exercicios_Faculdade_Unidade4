package Unidade04;

import java.util.Scanner;

public class Uni4Exe22 {

    public Uni4Exe22() {

        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma das opcoes a baixo\n" + "\"1: Ciência da Computação\n" + "2: Licenciatura da Computação\n" +"3: Sistemas de Informação");
        String escolha = in.nextLine();

        switch (escolha) {
            case "1":
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case "2":
                System.out.println("Licenciado em Computação");
                break;
            case "3":
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Escolha uma alternativa disponivel");
                break;
        }


        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe22();
    }
}
