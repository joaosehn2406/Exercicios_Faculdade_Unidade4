package Unidade04;

import java.util.Scanner;

public class Uni4Exe25 {

    public Uni4Exe25() {

        Scanner in = new Scanner(System.in);


        System.out.print("Escolha um numero: ");
        float num1 = in.nextFloat();

        System.out.print("Escolha outra numero: ");
        float num2 = in.nextFloat();

        
        System.out.println("Escolha uma das opcoes a baixo:\n1. Soma\n2. Subtracao\n3. Produto\n4. Divisao");
        int escolha = in.nextInt();

        float operacao = 0;

        switch (escolha) {
            case 1:
                operacao = num1 + num2;
                System.out.printf("A soma corresponde a %.1f", operacao);
                break;
            case 2:
                operacao = num1 - num2;
                System.out.printf("A subtracao corresponde a %.1f", operacao);
                break;
            case 3:
                operacao = num1 * num2;
                System.out.printf("O produto corresponde a %.1f", operacao);
                break;
            case 4:
                operacao = num1 / num2;
                System.out.printf("A divisao corresponde a %.1f", operacao);
                break;
            default:
                System.out.print("Escolha uma operacao valida.");
                break;

        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe25();
    }
}
