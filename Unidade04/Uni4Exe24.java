package Unidade04;

import java.util.Scanner;

public class Uni4Exe24 {

    public Uni4Exe24() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor");
        float valor1 = in.nextFloat();
        System.out.println("Digite um valor");
        float valor2 = in.nextFloat();
        System.out.println("Digite um valor");
        float valor3 = in.nextFloat();

        System.out.println("Escolha uma das opcoes: \nOpcao 1.\nOpcao 2.\nOpcao 3.");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1:
                if (valor1 < valor2 && valor1 < valor3) {
                    if (valor2 < valor3) {
                        System.out.printf("%.1f %.1f %.1f", valor1, valor2, valor3);
                    } else {
                        System.out.printf("%.1f %.1f %.1f", valor1, valor3, valor2);
                    }
                }
                break;
            case 2:
                if (valor1 < valor2 && valor1 < valor3) {
                    if (valor2 < valor3) {
                        System.out.printf("%.1f %.1f %.1f", valor3, valor2, valor1);
                    } else {
                        System.out.printf("%.1f %.1f %.1f", valor2, valor3, valor1);
                    }
                }
                break;
            case 3:
                if (valor1 < valor2 && valor1 < valor3) {
                    if (valor2 < valor3) {
                        System.out.printf("%.1f", valor2);
                    } else {
                        System.out.printf("%.1f", valor3);
                    }
                }
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe24();
    }
}
