package Unidade04;

import java.util.Scanner;

public class Uni4Exe26 {

    public Uni4Exe26() {

        Scanner in = new Scanner(System.in);

        System.out.println(
                "Qual das opcoes abaixo voce deseja?\n1.T ( triangulo )\n2. Q ( quadrado)\n3. R ( retangulo)\n4. C ( circulo).");
        String escolha = in.next();
        double calculo = 0;

        switch (escolha) {
            case "1":
                System.out.println("Escolha a base do triangulo: ");
                float base = in.nextFloat();
                System.out.println("Escolha a altura do triangulo: ");
                float altura = in.nextFloat();
                calculo = (base * altura) / 2;
                System.out.printf("A area do triangulo eh %.2f", calculo);
                break;
            case "2":
                System.out.println("Escolha o lado do quadrado: ");
                float lado = in.nextFloat();
                calculo = Math.pow(lado, 2);
                System.out.printf("A area do quadrado eh %.2f", calculo);
                break;
            case "3":
                System.out.println("Escolha a base do triangulo: ");
                float base1 = in.nextFloat();
                System.out.println("Escolha a altura do triangulo: ");
                float altura1 = in.nextFloat();
                calculo = (base1 * altura1);
                System.out.printf("A area do retangulo eh %.2f", calculo);
                break;
            case "4":
                System.out.println("Escolha o raio da circunferencia: ");
                float raio = in.nextFloat();
                calculo = Math.pow(raio, 2) * Math.PI;
                System.out.printf("A area do circulo eh %.2f", calculo);
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe26();
    }
}
