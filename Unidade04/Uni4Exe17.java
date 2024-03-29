package Unidade04;

import java.util.Scanner;

public class Uni4Exe17 {

    public Uni4Exe17() {

        Scanner in = new Scanner(System.in);

        float salario = in.nextFloat();
        salario *= 0.02f;

        if (salario < 2000) {
            salario *= 1;
        }
        if (salario <= 2000 && salario <= 5000) {
            salario *= 0.05f;
        }
        if (salario >= 5000 && salario <= 10000) {
            salario *= 0.1f;
        }
        if (salario > 15000) {
            salario *= 0.15f;
        }

        System.out.printf("O salario com desconto corresponde a %.2f reais.", salario);
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe17();
    }
}
