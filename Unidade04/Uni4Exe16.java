package Unidade04;

import java.util.Scanner;

public class Uni4Exe16 {

    public Uni4Exe16() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade do homem 1: ");
        int idadeHomem1 = in.nextInt();
        System.out.println("Digite a idade do homem 2: ");
        int idadeHomem2 = in.nextInt();
        System.out.println("Digite a idade da mulher 1: ");
        int idadeMulher1 = in.nextInt();
        System.out.println("Digite a idade da mulher 2: ");
        int idadeMulher2 = in.nextInt();

        int somaIdade = Math.max(idadeHomem1, idadeHomem2) + Math.min(idadeMulher1, idadeMulher2);
        int produtoIdade = Math.min(idadeHomem1, idadeHomem2) * Math.max(idadeMulher1, idadeMulher2);

        System.out.printf("A soma das idade eh %d e o produto eh %d", somaIdade, produtoIdade);
        in.close();

    }

    public static void main(String[] args) {
        new Uni4Exe16();
    }
}
