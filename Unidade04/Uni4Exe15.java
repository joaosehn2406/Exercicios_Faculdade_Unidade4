package Unidade04;

import java.util.Scanner;

public class Uni4Exe15 {

    public Uni4Exe15() {

        Scanner in = new Scanner(System.in);

        int qntdMeses = in.nextInt();
        float salario = in.nextFloat();

        if (qntdMeses <= 12) {
            salario *= 0.05f;
        }
        if (qntdMeses > 12 && qntdMeses <= 48) {
            salario *= 0.07f;
        }
        System.out.printf("O salario corresponde a %.2f reais.", salario);
        in.close();

    }

    public static void main(String[] args) {
        new Uni4Exe15();
    }
}
