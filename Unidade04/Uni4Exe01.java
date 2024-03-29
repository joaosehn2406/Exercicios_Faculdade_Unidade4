package Unidade04;

import java.util.Scanner;

public class Uni4Exe01 {

    public Uni4Exe01() {

        Scanner in = new Scanner(System.in);

        System.out.print("Qual a carga horária no mês? ");
        float horasMes = in.nextInt();

        System.out.print("Qual o valor da hora?");
        float valorHora = in.nextInt();
        float salarioTotal = horasMes * valorHora;
        if (horasMes > 160) {
            valorHora *= 0.5;
            float salarioExtra = (horasMes - 160) * valorHora;
            salarioTotal = salarioExtra + salarioTotal;
            System.out.printf("O valor pagou ao funcionário com hora extra é %.2f", salarioTotal);
        } else {
            System.out.printf("O salário final sem horas extras é %.1f", salarioTotal);
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe01();
    }
}
