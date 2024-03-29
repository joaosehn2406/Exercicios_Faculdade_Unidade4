package Unidade04;

import java.util.Scanner;


public class Uni4Exe06 {

    public Uni4Exe06() {

        Scanner in = new Scanner(System.in);

        String letra = in.next();

        if (letra == "M") {
            System.out.println("Masculino");
        }
        if (letra == "F") {
            System.out.println("Feminino");
        }
        if (letra == "I") {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada incorreta");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe06();
    }
}


