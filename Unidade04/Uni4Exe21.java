package Unidade04;

import java.util.Scanner;

public class Uni4Exe21 {

    public Uni4Exe21() {

        Scanner in = new Scanner(System.in);

        float massa = in.nextFloat();
        float altura = in.nextFloat();
        double imc = (massa) / Math.pow(altura, 2);

        if (imc < 18.5f) {
            System.out.println("Magreza");
        }
        if (imc > 18.5 && imc < 24.9) {
            System.out.println("Saudavel");
        }
        if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        }
        if (imc >= 30 && imc < 34.9) {
            System.out.println("Obesidade de grau I");
        }
        if (imc >= 35 && imc < 39.9) {
            System.out.println("Obesidade de grau II");
        }
        if (imc >= 40) {
            System.out.println("Obesidade de grau III");
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe21();
    }
}
